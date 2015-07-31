package br.com.vote.livro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("votacao/*")
public class VotacaoController {
	
	@RequestMapping
	public String computaVoto(int livroKey, int voto){
		//computar votos
		return " ";
	}
	
}
