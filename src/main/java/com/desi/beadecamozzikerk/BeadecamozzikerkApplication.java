package com.desi.beadecamozzikerk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.desi.beadecamozzikerk")

public class BeadecamozzikerkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeadecamozzikerkApplication.class, args);
	}

}
