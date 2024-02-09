package com.gestion.GestionCommande;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GestionCommandeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionCommandeApplication.class, args);
	}

}
