import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import br.com.vote.livro.dao.LivroDao;
import br.com.vote.livro.model.Livro;
import br.com.vote.livro.service.LivroService;

public class LivroServiceTest {
	
	@InjectMocks
	LivroService service;
	
	@Mock
	LivroDao livroDao;

	@Test
	public void deveListarLivros() {
		Livro livro1 = criaLivro(1, "Harry Potter");
		Livro livro2 = criaLivro(1, "Java");
		ArrayList<Livro> livros = new ArrayList<Livro>();
		livros.add(livro1);
		livros.add(livro2);	
		doReturn(livroDao).when(service.listarLivros());
		when(livroDao.listarLivros()).thenReturn(livros);
	}
	
	@Test
	public void deveObterLivro(){
		Livro livro = criaLivro(2, "O monge e o Executivo");
		assertEquals(livro, service.obterLivro(2));
	}

	public Livro criaLivro(int livroKey, String nome) {
		Livro livro = new Livro(livroKey);
		livro.setNome(nome);
		livro.setImagem("imagem.jpeg");

		return livro;
	}
}
