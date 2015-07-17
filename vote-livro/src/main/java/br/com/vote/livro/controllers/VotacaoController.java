package br.com.vote.livro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.vote.livro.model.Livro;
import br.com.vote.livro.service.LivroService;

@Controller
public class VotacaoController {
	
	@Autowired
	LivroService livroService;
	
	public List<Livro> listarLivros(){
		return livroService.listarLivros();
	}
	
}
