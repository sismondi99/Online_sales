package com.gestion.GestionCommande.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PRODUITS")
public class Produits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prix")
    private float prix;
    @Column(name = "quantite")
    private Integer quantite;
    
   
}
