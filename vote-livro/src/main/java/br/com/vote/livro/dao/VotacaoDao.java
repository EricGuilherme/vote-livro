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
		return null;
	}

	public void atualizaVotacao(Votacao votacao) {
		try{
			manager.merge(Votacao.class);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public Votacao obterVotacao(Livro livro) {
		int livroKey = livro.getLivroKey();
		String jpql = "select v from Votacao v where v.livroKey.livroKey = :livroKey";
		List<Votacao> votacoes = manager.createQuery(jpql, Votacao.class)
				.setParameter("livroKey", livroKey).getResultList();
		
		return votacoes.get(0);		
	}



}
