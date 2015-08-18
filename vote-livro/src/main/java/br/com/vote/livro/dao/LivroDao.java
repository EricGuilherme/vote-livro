package br.com.vote.livro.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Repository;

import br.com.vote.livro.model.Livro;
import br.com.vote.livro.model.Usuario;

@Repository
public class LivroDao {
	
	@PersistenceContext
	private EntityManager manager;

	public void salvar(Livro livro) {

	}

	public List<Livro> listarLivros() {
		String jpql = "select l from Livro l";
		return manager.createQuery(jpql, Livro.class).getResultList();
	}

	public Livro obterLivro(int livroKey) {
		
		List<Livro> livros = null;
		String jpql = "select l from Livro l where l.livroKey = :livroKey";
		livros = manager.createQuery(jpql, Livro.class)
				.setParameter("livroKey", livroKey).getResultList();
		
		return livros.get(0);
	}

	public void atualizaUsuario(Usuario usuario) {

	}

	public List<Livro> listarLivrosPorUsuario(Usuario usuario) {

		return null;
	}

}
