package br.com.vote.livro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.vote.livro.dao.LivroDao;
import br.com.vote.livro.dao.VotacaoDao;
import br.com.vote.livro.model.Livro;
import br.com.vote.livro.model.Usuario;
import br.com.vote.livro.model.Votacao;

@Service
public class VotacaoService {
	
	@Autowired
	private VotacaoDao votacaoDao;
	@Autowired
	private LivroDao livroDao;
	
	public void setVotacaoDao(VotacaoDao votacaoDao) {
		this.votacaoDao = votacaoDao;
	}
	
	public void setLivroDao(LivroDao livroDao) {
		this.livroDao = livroDao;
	}
	
	public List<Votacao> listarVotacao() {
		return votacaoDao.listarVotacao();
	}
	
	public Votacao obterVotacao(Livro livro){
		return votacaoDao.obterVotacao(livro);
	}

	@Transactional
	public void atualizaVotacao(Livro livro) {
		Votacao votacao = obterVotacao(livro);
		
		int novoVoto = votacao.getVoto() + 1;

		votacao.setVoto(novoVoto);
		votacaoDao.atualizaVotacao(votacao);
	}
	
}
