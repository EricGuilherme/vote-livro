package br.com.vote.livro.test;


import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.vote.livro.dao.LivroDao;
import br.com.vote.livro.dao.VotacaoDao;
import br.com.vote.livro.model.Livro;
import br.com.vote.livro.model.Votacao;
import br.com.vote.livro.service.VotacaoService;

@RunWith(MockitoJUnitRunner.class)
public class VotacaoServiceTest {

	public VotacaoService votacaoService;

	@Mock
	private VotacaoDao votacaoDao;
	
	@Mock
	private LivroDao livroDao;
	
	@Before
	public void setUp(){
		votacaoService = new VotacaoService();
		votacaoService.setVotacaoDao(votacaoDao);
		votacaoService.setLivroDao(livroDao);
	}
	
	@Test
	public void deveListarVotacoesExistentes(){
		List<Votacao> votacoes = votacaoService.listarVotacao();
		
		doReturn(votacoes).when(votacaoDao).listarVotacao();
		verify(votacaoDao).listarVotacao();
	}
	
	@Test
	public void deveAtualizarVoto(){
		Livro livro = new Livro(123);
		Votacao votacao = new Votacao(432);
		
		doReturn(livro).when(livroDao).obterLivro(123);
		doReturn(votacao).when(votacaoDao).obterVotacao(livro);
		
		votacaoService.atualizaVotacao(123);
		
		verify(livroDao).obterLivro(123);
		verify(votacaoDao).obterVotacao(livro);
		verify(votacaoDao).atualizaVotacao(votacao);
		
	}
	
	
}
