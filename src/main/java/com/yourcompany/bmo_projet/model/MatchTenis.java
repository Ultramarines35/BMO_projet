package com.yourcompany.bmo_projet.model;

//import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
class MatchTennis extends InterfaceMatch{
	
	@Column(length=50) @Required
	public TypeSport typeSport = TypeSport.Tenis;
}