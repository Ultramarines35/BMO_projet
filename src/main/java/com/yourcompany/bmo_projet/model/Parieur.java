package com.yourcompany.bmo_projet.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Parieur{
	
	@Id @Column(length=9) @Required
	private int idParieur;
	
	@Column(length=50)
	private String surnom;
	
	@Column(length=50) @Required
	private String mdp;
	
	@Column(length=50) @Required
	private String adresseMail;
	
	@Column(length=10) @Required
	private int solde;
	
	//@Column(length=9) @Required
	//public List<ParisPlace> parisPlace;

	//public void placerParis(int idParis,int montant){
		//TODO
}