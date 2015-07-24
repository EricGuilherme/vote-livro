package br.com.vote.livro.model;

import javax.persistence.Transient;

public class Usuario {
	
	private int usuarioKey;
	private String nome;
	private String email;
	@Transient
	private Votacao votacaoKey;
	
	public int getUsuarioKey() {
		return usuarioKey;
	}
	
	public void setUsuarioKey(int usuarioKey) {
		this.usuarioKey = usuarioKey;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}
