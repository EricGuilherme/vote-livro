import java.util.ArrayList;

import org.junit.Test;

import br.com.vote.livro.model.Livro;


public class LivroServiceTest {
	
	@Test
	public void deveListarLivros(){
		Livro livro1 = criaLivro(1, "Harry Potter");
		Livro livro2 = criaLivro(1, "Java");
		ArrayList<Livro> livros = new ArrayList<Livro>();
		livros.add(livro1);
		livros.add(livro2);
		
		
		
	}

	public Livro criaLivro(int livroKey, String nome) {
		Livro livro = new Livro(livroKey);
		livro.setNome(nome);
		livro.setImagem("imagem.jpeg");
		
		return livro;
	}
}
