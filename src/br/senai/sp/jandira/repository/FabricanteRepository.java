package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {
	
	Fabricante[] fabricantes;
	
	public FabricanteRepository(){
	this.fabricantes =  new Fabricante[20];
	fabricantes[0] = new Fabricante("Ubisoft","Montreuil","1986");
	fabricantes[1] = new Fabricante("Activision","Califórnia","1979");
	fabricantes[2] = new Fabricante("Rockstar","Nova York","1998");
	fabricantes[3] = new Fabricante("Electronic Arts","Califórnia","1992");
	fabricantes[4] = new Fabricante("Bethesda","Maryland","1986");
	fabricantes[5] = new Fabricante("PlayStation Studios","Não citado","2020");
	
	}
} 



