package com.gestion.GestionCommande.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PRODUITS")
public class Produits {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prix")
    private float prix;
    @Column(name = "quantite")
    private int quantite;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user_id;
}
