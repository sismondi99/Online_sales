package com.gestion.GestionCommande.service;

import com.gestion.GestionCommande.models.Produits;
import com.gestion.GestionCommande.repository.ProduitsRepository;
import org.springframework.stereotype.Service;

@Service
public class ProduitsService {

    private ProduitsRepository produitsRepository;

    public ProduitsService(ProduitsRepository produitsRepository) {
        this.produitsRepository = produitsRepository;
    }

    public void create(Produits produits) {
        this.produitsRepository.save(produits);
    }
}
