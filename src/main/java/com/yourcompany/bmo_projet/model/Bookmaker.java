package com.yourcompany.bmo_projet.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
class Bookmaker{
	
	@Id @Column(length=9) @Required
	private int idBookmaker;
	
	@Column(length=9) @Required
	private String mdp;
	
	@Column(length=9)
	private String adresseMail;

	
	
	
/*	
	public void creerParis(InterfaceParis paris){
		//TODO
	}
	public void creerMatch(InterfaceMatch match){
		//TODO
	}
	public void creerEquipe(Equipe equipe){
		//TODO
	}
	public void detruitParis(int idParis){
		//TODO
	}
	public void detruitMatch(int idMatch){
		//TODO
	}
	public void detruitEquipe(int idEquipe){
		//TODO
	}
	public void resoudreMatch(int idMatch){
		//TODO
	}
*/
}