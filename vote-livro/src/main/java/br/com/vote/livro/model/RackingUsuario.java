package br.com.vote.livro.model;

import javax.persistence.Entity;


@Entity
public class RackingUsuario {
	
	private Livro livroKey;

	public RackingUsuario(Livro livroKey) {
		this.livroKey = livroKey;
	}
	
	public Livro getLivroKey() {
		return livroKey;
	}
	
}
