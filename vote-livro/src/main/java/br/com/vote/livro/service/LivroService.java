package br.com.vote.livro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vote.livro.dao.LivroDao;
import br.com.vote.livro.model.Livro;

@Service
public class LivroService {
	
	@Autowired
	LivroDao livroDao;

	public List<Livro> listarLivros() {
		return livroDao.listarLivros();
	}

	public Livro obterLivro(int livroKey) {
		return livroDao.obterLivro(livroKey);
	}

	
}
