package com.desi.beadecamozzikerk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.desi.beadecamozzikerk.domain.Camino;
import com.desi.beadecamozzikerk.domain.Camion;
import com.desi.beadecamozzikerk.domain.Ciudad;
import com.desi.beadecamozzikerk.service.ICaminoService;
import com.desi.beadecamozzikerk.service.ICiudadService;

import java.util.List;



@Controller
@RequestMapping("/caminos")
public class CaminoController {

    @Autowired
    private ICaminoService caminoService;
    
    @Autowired
    private ICiudadService ciudadService;
    
    //@SuppressWarnings("unchecked")
	@GetMapping
	
             public String listarCaminos(Model model) {
              List<Camino> caminos = caminoService.obtenerCaminos();
              List<Ciudad> ciudades = ciudadService.getCiudades();
              System.out.println("Lista de caminos: " + caminos);
         
               model.addAttribute("caminos", caminos);
               model.addAttribute("ciudades", ciudades);
                return "gestionar_caminos";
           }
    @PostMapping("/agregar")
    public String agregarCamino(@ModelAttribute Camino camino, RedirectAttributes redirectAttributes) {
        try {
            caminoService.guardar(camino);
            redirectAttributes.addFlashAttribute("success", "Camino agregado correctamente.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error al agregar el camino: " + e.getMessage());
        }
        return "redirect:/caminos";
    }

    @PostMapping("/borrar/{id}")
    public String eliminarCamino(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        try {
            caminoService.borrar(id);
            redirectAttributes.addFlashAttribute("success", "Camino eliminado correctamente.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error al eliminar el camino: " + e.getMessage());
        }
        return "redirect:/caminos";
    }
}
            
   

    
   

