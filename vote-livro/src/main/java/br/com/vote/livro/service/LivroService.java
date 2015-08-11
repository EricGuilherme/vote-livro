package br.com.vote.livro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.vote.livro.dao.LivroDao;
import br.com.vote.livro.model.Livro;
import br.com.vote.livro.model.Usuario;
import br.com.vote.livro.model.Votacao;

@Service
public class LivroService {
	
	@Autowired
	LivroDao livroDao;

	public void setLivroDao(LivroDao livroDao) {
		this.livroDao = livroDao;
	}
	
	public List<Livro> listarLivros() {
		return livroDao.listarLivros();
	}

	public Livro obterLivro(int livroKey) {
		return livroDao.obterLivro(livroKey);
	}

	public void atualizaVoto(Livro livro) {
		livroDao.atualizaVoto(livro);
	}

	public void atualizaUsuario(Usuario usuario) {
		livroDao.atualizaUsuario(usuario);
	}

	public List<Livro> listarLivrosPorUsuario(Usuario usuario) {
		return livroDao.listarLivrosPorUsuario(usuario);
	}


	
}
