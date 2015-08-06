package br.com.vote.livro.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import br.com.vote.livro.model.Livro;
import br.com.vote.livro.model.Usuario;

@Repository
public class LivroDao {
	
	private EntityManager manager;

	public void salvar(Livro livro) {
		manager.persist(livro);
	}
	
	public List<Livro> listarLivros() {
		return null;
	}

	public Livro obterLivro(int livroKey) {
		return null;
	}

	public void atualizaVoto(Livro livro) {
		
	}

	public void atualizaUsuario(Usuario usuario) {
		
	}

	public List<Livro> listarLivrosPorUsuario(Usuario usuario) {

		return null;
	}
	
	

}
