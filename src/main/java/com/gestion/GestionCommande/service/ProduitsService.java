package com.gestion.GestionCommande.service;

import com.gestion.GestionCommande.models.Produits;
import com.gestion.GestionCommande.repository.ProduitsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitsService {

    private final ProduitsRepository produitsRepository;

    public ProduitsService(ProduitsRepository produitsRepository) {
        this.produitsRepository = produitsRepository;
    }

    public void create(Produits produits) {
        Optional<Produits> product = this.produitsRepository.findById(produits.getId());
        if (product.isEmpty()) {
            this.produitsRepository.save(produits);
        }
    }

    public List<Produits> findAllProduits(){
        return this.produitsRepository.findAll();
    }

    public Produits read(int id) {
        Optional<Produits> produit = this.produitsRepository.findById(id);
        return produit.orElse(null);
    }
}