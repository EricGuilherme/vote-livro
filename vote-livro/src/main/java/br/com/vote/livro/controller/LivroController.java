package br.com.vote.livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.vote.livro.model.Livro;
import br.com.vote.livro.service.LivroService;
import br.com.vote.livro.service.VotacaoService;

@Controller
@RequestMapping("livro/")
public class LivroController {

	@Autowired 
	private LivroService livroService;
	
	@Autowired
	private VotacaoService votacaoService;
	
	@RequestMapping("/")
	public String index(Model model){
		List<Livro> listarLivros = livroService.listarLivros();
		model.addAttribute("livros", listarLivros);
		return "livro/index.jsp";
	}
	
	@RequestMapping("atualizaVoto/") 
	@ResponseBody
	public boolean atualizaVoto(int livroKey){
		Livro livro = livroService.obterLivro(livroKey);
		if(livro.equals(null)){
			return false;
		}
		livroService.atualizaVoto(livro);
		votacaoService.atualizaVotacao(livro);
		return true;
	}	
}
 