package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionePrenotazioniApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(GestionePrenotazioniApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8086")); // Imposta la porta desiderata
		app.run(args);
	}

}
