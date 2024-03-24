package com.yourcompany.bmo_projet.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
class ParisOrdreExact extends InterfaceParis{
	
	@Id @Column(length=9) @Required
	private List<Integer> equipeIdList;
	
	@Column(length=9) @Required
	private List<Integer> equipeIdListVainqueur;
}