package com.desi.beadecamozzikerk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/")
	public String verPaginaDeInicio() {
		return "index";
	}

	@GetMapping("/gestionar-camiones")
	public String gestionarCamiones() {
		return "gestionar_camiones"; // HTML para gestión de camiones
	}
}
