package br.com.vote.livro.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Livro {
	
	@Id
	private int livroKey;
	private String nome;
	private String imagem;
	
	public Livro(int livroKey) {
		this.livroKey = livroKey;
	}

	public Livro() {
	}

	public int getLivroKey() {
		return livroKey;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
 

}
