package br.com.vote.livro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usuario_key")
	private int usuarioKey;
	private String email;
	private String senha;
	
	public Usuario(int usuarioKey) {
		this.usuarioKey = usuarioKey;
	}
	
	public Usuario() {
	}
	
	public Usuario(String email, String senha){
		this.email = email;
		this.senha = senha;
	}
	
	
	public int getUsuarioKey() {
		return usuarioKey;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setUsuarioKey(int usuarioKey) {
		this.usuarioKey = usuarioKey;
	}

}
