package br.com.vote.livro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.vote.livro.dao.LivroDao;
import br.com.vote.livro.model.Livro;

@Controller
public class LivroController {
	
	@Autowired
	LivroDao livroDao;
	
	@RequestMapping("/livros")
	public String salvar(Livro livro){
		livroDao.adiciona(livro);
		return "livros/ok";
	}
	
	@RequestMapping("/livros/form")
	public String form(){
		return "livros/livros.index";
	}
}
