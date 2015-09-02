package br.com.vote.livro.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.vote.livro.model.Livro;
import br.com.vote.livro.model.Votacao;

@Repository
public class VotacaoDao {

	@PersistenceContext
	private EntityManager manager;

	public List<Votacao> listarVotacao() {
		String sql = "select v from Votacao v order by v.voto desc";
		return manager.createQuery(sql, Votacao.class).getResultList();
	}

	public void atualizaVotacao(Votacao votacao) {
		manager.merge(votacao);
	}

	public Votacao obterVotacao(Livro livro) {
		int livroKey = livro.getLivroKey();
		String jpql = "select v from Votacao v where v.livro.livroKey = :livroKey";
		return manager.createQuery(jpql, Votacao.class)
				.setParameter("livroKey", livroKey).getSingleResult();
		
	}



}
