package br.com.vote.livro.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Usuario {
	
	@Id
	private int usuarioKey;
	private String nome;
	private String email;
	private String senha;
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

	public Votacao getVotacaoKey() {
		return votacaoKey;
	}

	public void setVotacaoKey(Votacao votacaoKey) {
		this.votacaoKey = votacaoKey;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
