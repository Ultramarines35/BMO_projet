package com.yourcompany.bmo_projet.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
class ParisPlace{
	
	@Id @Column(length=9) @Required
	private int montant;
	
	@Column(length=9) @Required
	public Parieur parieur;
	
	@Column(length=9) @Required
	public InterfaceParis interfaceParis;
	
	//public void resoudreGains(){
		//TODO
	//}
}