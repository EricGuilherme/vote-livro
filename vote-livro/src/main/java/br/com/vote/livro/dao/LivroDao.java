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
		return null;
	}

	public Livro obterLivro(int livroKey) {
		return manager.createQuery("select l from Livro l where l.livroKey = :livroKey", Livro.class).setParameter("livroKey", livroKey).getSingleResult();
	}

	public void atualizaVoto(Livro livro) {
		manager.createQuery("update Livro set ").executeUpdate();
	}

	public void atualizaUsuario(Usuario usuario) {

	}

	public List<Livro> listarLivrosPorUsuario(Usuario usuario) {

		return null;
	}

}
