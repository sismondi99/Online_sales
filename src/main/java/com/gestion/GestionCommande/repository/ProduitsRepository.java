package com.gestion.GestionCommande.repository;

import com.gestion.GestionCommande.models.Produits;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitsRepository extends JpaRepository<Produits, Integer> {

}
