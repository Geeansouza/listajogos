package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogos;

public class JogosRepository {
	
	private Jogos[] lista;

	public JogosRepository() {
		lista = new Jogos[32];
	}

	public JogosRepository(int quantidadeJogos){
		lista = new Jogos [quantidadeJogos];
	}

	public void gravar(Jogos jogos, int posicao) {
		lista[posicao] = jogos;
	}

	public Jogos listarJogos(int posicao) {
		return lista[posicao];
	}

	public Jogos[] listarJogos() {
		return lista;
	}
}


