package br.com.vote.livro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.vote.livro.dao.VotacaoDao;
import br.com.vote.livro.model.Votacao;

public class VotacaoService {
	
	@Autowired
	private VotacaoDao votacaoDao;
	
	public void setVotacaoDao(VotacaoDao votacaoDao) {
		this.votacaoDao = votacaoDao;
	}

	public List<Votacao> listarVotacao() {
		return votacaoDao.listarVotacao();
	}

}
