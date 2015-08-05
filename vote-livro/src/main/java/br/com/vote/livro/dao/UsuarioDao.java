package br.com.vote.livro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.vote.livro.model.Usuario;

@Repository
public class UsuarioDao {

	public Usuario salvar(Usuario usuario) {
		
		return usuario;
	}

	public List<Usuario> listarVotacao(Usuario usuario) {
		
		return null;
	}

}
