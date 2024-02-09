package com.gestion.GestionCommande.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "USERS")
public class Users {
		 @Id
	     private Integer id;
	     
	     private String first_Name;
	     
	     private String last_Name;
	     
	     private String mail;
	     
	     private String password;
}
