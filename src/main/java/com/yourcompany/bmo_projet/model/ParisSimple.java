package com.yourcompany.bmo_projet.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
class ParisSimple extends InterfaceParis{
	
	@Id @Column(length=9) @Required
	private int equipeId;
	
	@Column(length=9) @Required
	private int equipeIdVainqueur;
}