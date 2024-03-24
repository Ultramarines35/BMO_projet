
package com.yourcompany.bmo_projet.model;

//import java.util.*;


import javax.persistence.*;

import org.openxava.annotations.*;

abstract
class InterfaceParis{
	
	@Id @Column(length=9) @Required
	int idParis = 0;
	
	@Column(length=9) @Required
	float cote = 1;
	
	//@Column(length=9) @Required
	//public List<ParisPlace> parisPlace = null;
	
	@Column(length=9) @Required
	public InterfaceMatch interfaceMatch = null;

	//public void resoudreParis();
}