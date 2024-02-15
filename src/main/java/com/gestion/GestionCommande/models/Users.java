package com.gestion.GestionCommande.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "USERS")
public class Users {
		 @Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		 @Column(name = "id")
	     private int id;
		 @Column(name = "first_name")
	     private String first_Name;
	     @Column(name = "last_name")
	     private String last_Name;
	     @Column(unique = true, name = "mail")
	     private String mail;
	     @Column(name = "password")
	     private String password;
}
