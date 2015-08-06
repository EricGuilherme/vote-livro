package br.com.vote.livro.test;


import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

import java.util.List;

import br.com.vote.livro.dao.VotacaoDao;
import br.com.vote.livro.model.Livro;
import br.com.vote.livro.model.Votacao;
import br.com.vote.livro.service.VotacaoService;

@RunWith(MockitoJUnitRunner.class)
public class VotacaoServiceTest {
	
	private VotacaoService votacaoService;

	@Mock
	private VotacaoDao votacaoDao;
	
	@Before
	public void setUp(){
		votacaoService = new VotacaoService();
		votacaoService.setVotacaoDao(votacaoDao);
	}

	@Test
	public void deveListarVotacoesExistentes(){
		List<Votacao> votacoes = votacaoService.listarVotacao();
		
		doReturn(votacoes).when(votacaoDao).listarVotacao();
		verify(votacaoDao).listarVotacao();
	}
	
	
}
