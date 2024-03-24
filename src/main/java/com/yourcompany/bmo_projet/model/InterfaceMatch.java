package com.yourcompany.bmo_projet.model;

//import java.util.*;


import javax.persistence.*;

import org.openxava.annotations.*;


abstract
class InterfaceMatch{
	
	@Id @Column(length=9) @Required
	public int idMatch = 0;
	
	@Column(length=50) @Required
	public String nomMatch = "";
	
	@Column(length=50) @Required
	public String description = "";
	
	@Column(length=50) @Required
	public TypeSport typeSport = null;
	
	
	//@Column(length=50) @Required
	//public List<Integer> listePoint = null;
	
	//@Column(length=50) @Required
	//public List<InterfaceParis> interfaceParis = null;

	//public void resoudreMatch();
}