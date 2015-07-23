package br.com.vote.livro.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.vote.livro.model.Livro;
import br.com.vote.livro.service.LivroService;

@Controller
public class VotacaoController {
	
	@Autowired
	private LivroService livroService;
	
	public List<Livro> listarLivros(){
		return livroService.listarLivros();
	}
	
	@RequestMapping
	public void votacao(int livroKey, int voto){
		Livro livro = livroService.obterLivro(livroKey);
		setVotacao(livro, voto);
	}
	
	@RequestMapping
	public void setVotacao(Livro livro, int voto){
		Map<Livro, Integer> votacoes = new HashMap<Livro, Integer>();
		votacoes.put(livro, voto);
	}
	
	@RequestMapping
	@ResponseBody
	public String rackingUsuario(){
		
		return "rackingUsuario.jsp";
	}
}
