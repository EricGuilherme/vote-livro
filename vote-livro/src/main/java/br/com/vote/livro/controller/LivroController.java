package br.com.vote.livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.vote.livro.model.Livro;
import br.com.vote.livro.service.LivroService;
import br.com.vote.livro.service.VotacaoService;

@Controller
@RequestMapping
public class LivroController {

	@Autowired 
	private LivroService livroService;
	
	@Autowired
	private VotacaoService votacaoService;
	
//	@RequestMapping
//	public String obrigado(){
//
//		return "livro/obrigado.jsp";
//	}
	
	@RequestMapping
	public void atualizaVoto(int livroKey){
		Livro livro = livroService.obterLivro(livroKey);
		livroService.atualizaVoto(livro);
		votacaoService.atualizaVotacao(livroKey);
	}
	
	@RequestMapping("/")
	public String index(Model model){
		List<Livro> listarLivros = livroService.listarLivros();
		model.addAttribute("livros", listarLivros);
		return "index.jsp";
	}
		
}
 