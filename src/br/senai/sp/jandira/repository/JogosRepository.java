package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogos;

public class JogosRepository {
	
	private Jogos[] turma;

	public JogosRepository() {
		turma = new Jogos[32];
	}

	public JogosRepository(int quantidadeJogos){
		turma = new Jogos [quantidadeJogos];
	}

	public void gravar(Jogos jogos, int posicao) {
		turma[posicao] = jogos;
	}

	public Jogos listarJogos(int posicao) {
		return turma[posicao];
	}

	public Jogos[] listarJogos() {
		return turma;
	}
}


