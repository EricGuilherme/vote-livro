package br.com.vote.livro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.vote.livro.service.VotacaoService;

@Controller
@RequestMapping("votacao/*")
public class VotacaoController {
	
	@Autowired
	VotacaoService votacaoService;
	
	@RequestMapping
	public String computaVoto(int livroKey, int voto, HttpRequest request){
		votacaoService.incluirVoto(livroKey, voto);
		return " ";
	}
	
}
