package br.com.vote.livro.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.vote.livro.dao.LivroDao;
import br.com.vote.livro.model.Livro;

@Controller
@Transactional
public class LivroController {
	
	@Autowired
	LivroDao livroDao;
	
	@RequestMapping("/livros")
	public String salvar (Livro livro){
		livroDao.adiciona(livro);
		return "livros/livros.index";
	}
	
	@RequestMapping("/livros/form")
	public String form(){
		return "livros/livros.index";
	}
}
