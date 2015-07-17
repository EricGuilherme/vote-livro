package br.com.vote.livro.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class RackingGeral {
	
	private int rackingGeralKey;
	private Livro livro;
	private int quantidadeVotos;

	public List<Livro> livros;

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public int getQuantidadeVotos() {
		return quantidadeVotos;
	}

	public void setQuantidadeVotos(int quantidadeVotos) {
		this.quantidadeVotos = quantidadeVotos;
	}

	public int getRackingGeralKey() {
		return rackingGeralKey;
	}

	public void setRackingGeralKey(int rackingGeralKey) {
		this.rackingGeralKey = rackingGeralKey;
	}
}
