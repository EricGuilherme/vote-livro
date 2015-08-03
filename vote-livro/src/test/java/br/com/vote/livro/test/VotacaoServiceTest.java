package br.com.vote.livro.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
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
	public void deveComputarVoto(){
		Livro livro = new Livro(123);
		Votacao votacao = new Votacao(1);
		votacao.setLivro(livro);
		
		for (int voto = 0; voto <= 5; voto++) {
			votacaoService.incluirVoto(livro.getLivroKey(), 1);
			votacao.setVoto(voto);;
		}
		
		votacaoService.salvaVotacao(votacao);
		
		assertEquals(1, votacao.getVotacaoKey());
		assertEquals(livro, votacao.getLivro());
		assertEquals(5, votacao.getVoto());
	}
	
	@Test
	public void deveSalvarVotacao(){
		Livro livro = new Livro(123);
		Votacao votacao = new Votacao(1);
		votacao.setLivro(livro);
		
		votacaoService.salvaVotacao(votacao);
		
		
	}
	
	

//    @Test
//    public void deveSalvarUmBico() {
//        doReturn(bicoCombustivel).when(bicoCombustivelDao).salvar(bicoCombustivel);
//
//        BicoCombustivel bicoCombustivelSalvar = service.salvarBicoCombustivel(bicoCombustivel);
//
//        verify(bicoCombustivelDao, times(1)).salvar(bicoCombustivel);
//        assertEquals(bicoCombustivel, bicoCombustivelSalvar);
//    }
//
//    @Test
//    public void deveObterUmBicoCombustivel() {
//        doReturn(bicoCombustivel).when(bicoCombustivelDao).obter(bicoCombustivelKey);
//
//        BicoCombustivel bicoCombustivelObter = service.obterBicoCombustivel(bicoCombustivelKey);
//
//        verify(bicoCombustivelDao, times(1)).obter(bicoCombustivelKey);
//        assertEquals(bicoCombustivel, bicoCombustivelObter);
//    }
//
//    @Test
//    public void deveListarBicoCombustivelPor() {
//        int bombaCombustivelKey = 10;
//        service.listarBicoCombustivelPor(bombaCombustivelKey);
//
//        verify(bicoCombustivelDao, atLeastOnce()).listarBicoCombustivelPor(bombaCombustivelKey);
//
//    }

	
	
}
