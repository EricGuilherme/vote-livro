package br.com.vote.livro.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.vote.livro.dao.LivroDao;
import br.com.vote.livro.model.Livro;
import br.com.vote.livro.model.Usuario;
import br.com.vote.livro.service.LivroService;

@RunWith(MockitoJUnitRunner.class)
public class LivroServiceTest {
	
	private LivroService livroService;
	
	@Mock
	private LivroDao livroDao;
	
	@Before
	public void setUp(){
		livroService = new LivroService();
		livroService.setLivroDao(livroDao);
	}

	@Test
	public void deveListarLivros() {
		Livro livro1 = new Livro(123);
		Livro livro2 = new Livro(1234);
		ArrayList<Livro> livros = new ArrayList<Livro>();
		livros.add(livro1);
		livros.add(livro2);	

		doReturn(livros).when(livroDao).listarLivros();
	}
	
	@Test
	public void deveObterLivro(){
		Livro livro = new Livro(123);
		
		doReturn(livro).when(livroDao).obterLivro(2);
		
		assertEquals(livro, livroDao.obterLivro(2));
	}

	@Test
	public void deveVotarApenas5Vezes(){
		Livro livro = new Livro(123);
		for (int voto = 0; voto <= 5; voto++) {
			livroService.atualizaVoto(livro);
			livro.setVoto(voto);
		}
		assertEquals(5, livro.getVoto());
	}
	
	@Test
	public void deveAtualizarVotoNoLivro(){
		Livro livro = new Livro(123);
		
		doReturn(livro).when(livroDao).obterLivro(123);
		
		livroService.atualizaVoto(livro);
		livroService.atualizaVoto(livro);
		
		assertEquals(livro.getVoto(), 1);
	}
	
	@Test
	public void deveAtualizarVotoEmLivrosDiferentesEQtdVotosIgualA5(){
		Livro livro1 = new Livro(123);
		Livro livro2 = new Livro(456);
		
		doReturn(livro1).when(livroDao).obterLivro(123);
		doReturn(livro2).when(livroDao).obterLivro(456);
		
		livroService.atualizaVoto(livro1);
		livroService.atualizaVoto(livro1);
		livroService.atualizaVoto(livro2);
		livroService.atualizaVoto(livro2);
		livroService.atualizaVoto(livro2);
		
		assertEquals(livro1.getVoto(), 2);
		assertEquals(livro2.getVoto(), 3);
		assertEquals(5, livro1.getVoto() + livro2.getVoto());
	}
	
	@Test
	public void deveAtualizarUsuario(){
		Livro livro = new Livro(123);
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
	
}
