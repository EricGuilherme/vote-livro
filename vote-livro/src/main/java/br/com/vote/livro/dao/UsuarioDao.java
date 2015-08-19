package br.com.vote.livro.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.vote.livro.model.Usuario;

@Repository
public class UsuarioDao {
	
	@PersistenceContext
	EntityManager manager;

	public void salvar(Usuario usuario) {
		manager.persist(usuario);
	}

	public List<Usuario> listarVotacao(Usuario usuario) {
		
		return null;
	}

}
