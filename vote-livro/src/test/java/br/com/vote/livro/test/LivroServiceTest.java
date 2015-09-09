package br.com.vote.livro.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import br.com.vote.livro.dao.LivroDao;
import br.com.vote.livro.model.Livro;
import br.com.vote.livro.model.Usuario;
import br.com.vote.livro.service.LivroService;

@RunWith(MockitoJUnitRunner.class)
public class LivroServiceTest {
	
	@InjectMocks
	private LivroService livroService = new LivroService();;
	
	@Mock
	private LivroDao livroDao;

	private Livro livro;
	private int livroKey = 123;

	@Before
	public void setUp(){
		FixtureFactoryLoader.loadTemplates("br.com.vote.livro.ff.template");
	}

	@Test
	public void deveListarLivros() {
		dadoUmaListaDeLivrosValidos();
		aoListar();
		verificaSeOsLivrosForamListados();
	}
	
	@Test
	public void obterLivro(){
		dadoUmLivroValido();
		pegaOLivro();
		verificaLivroRetornado();
	}
	
	@Test
	public void deveVotarApenas5Vezes(){
		dadoUmLivroValido();
		for (int voto = 0; voto <= 5; voto++) {
			livroService.atualizaVoto(livro);
			livro.setVoto(voto);
		}
		assertEquals(5, livro.getVoto());
	}
	
	@Test
	public void deveAtualizarVotoNoLivro(){
		dadoUmLivroValido();
		
		doReturn(livro).when(livroDao).obterLivro(123);
		
		livroService.atualizaVoto(livro);
		livroService.atualizaVoto(livro);
		
		assertEquals(livro.getVoto(), 2);
	}
	
	@Test
	public void deveAtualizarVotoEmLivrosDiferentesEQtdVotosIgualA5(){

	}
	
	@Test
	public void deveAtualizarUsuario(){
		dadoUmLivroValido();
		Usuario usuario = new Usuario(1);
		livro.setUsuario(usuario);
		
		livroService.atualizaUsuario(usuario);
		
		verify(livroDao).atualizaUsuario(usuario);
	}
	
	@Test
	public void deveListarLivrosPorUsuario(){
		Usuario usuario = new Usuario(123);
		List<Livro> livros = livroService.listarLivrosPorUsuario(usuario);
		
		doReturn(livros).when(livroDao).listarLivrosPorUsuario(usuario);
		
		verify(livroDao).listarLivrosPorUsuario(usuario);
		
	}
	
	public void verificaLivroRetornado() {
		verify(livroDao).obterLivro(livroKey);
	}

	public void pegaOLivro() {
		livroService.obterLivro(livroKey);
	}
	
	public void verificaSeOsLivrosForamListados() {
		verify(livroDao).listarLivros();
	}

	public void aoListar() {
		livroService.listarLivros();
	}

	public void dadoUmaListaDeLivrosValidos() {
		List<Livro> livros = Fixture.from(Livro.class).gimme(2, "valido");
		doReturn(livros).when(livroDao).listarLivros();
	}
	
	public void dadoUmLivroValido() {
		Livro livro = Fixture.from(Livro.class).gimme("valido");
		doReturn(livro).when(livroDao).obterLivro(livroKey);
	}
	
}
