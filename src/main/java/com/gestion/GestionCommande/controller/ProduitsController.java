package com.gestion.GestionCommande.controller;

import com.gestion.GestionCommande.models.Produits;
import com.gestion.GestionCommande.service.ProduitsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "produits")
public class ProduitsController {
    private ProduitsService produitsService;

    public ProduitsController(ProduitsService produitsService) {
        this.produitsService = produitsService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void create(@RequestBody Produits produits) {
        this.produitsService.create(produits);
    }
}
