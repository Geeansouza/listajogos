package br.senai.sp.jandira.model;

public class Jogos {
		
	private String tituloJogo;
	private Double ValorJogo;
	private String observacao;
	private ConsolesEnum console;
	//titulo do jogo
	public String getTituloJogo() {
		return tituloJogo;
	}
	public void setTituloJogo(String tituloJogo) {
		this.tituloJogo = tituloJogo;
	}
	//Valor do jogo
	public Double getValorJogo() {
		return ValorJogo;
	}
	public void setValorJogo(Double valorJogo) {
		ValorJogo = valorJogo;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public ConsolesEnum getConsole() {
		return console;
	}
	public void setConsole(ConsolesEnum console) {
		this.console = console;
	}
	

}
