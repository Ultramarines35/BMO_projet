package com.yourcompany.bmo_projet.model;

import javax.persistence.*;

import org.openxava.annotations.*;

class Equipe{
	
	@Id @Column(length=9) @Required
	private int idEquipe;
	
	@Column(length=9) @Required
	private String nomEquipe;
	
	@Column(length=9) @Required
	private TypeSport typeSport;
	
	//@Column(length=9) @Required
	//public List<InterfaceMatch> interfaceMatch;
}