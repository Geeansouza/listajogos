package br.senai.sp.jandira.model;

public enum ConsolesEnum {
	XBOX("Xbox"),PLAYSTATION("Playstation"),NINTENDO("Nintendo"),PC("Pc");
	
	private String descricao;
	
	private ConsolesEnum (String descricao){
		this.descricao = descricao;
	}
	public String getDescricao() {
	return descricao;
	}

}
