package br.com.vote.livro.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		model.addAttribute("listarLivros", listarLivros());
		return "livro/index.jsp";
	}
	
	public List<Livro> listarLivros(){
		List<Livro> listarLivros = livroService.listarLivros();
		return listarLivros;
	}
	
	
	@RequestMapping("atualizaVoto/") 
	@ResponseBody
	public String atualizaVoto(int livroKey){
		Livro livro = livroService.obterLivro(livroKey);
		livroService.atualizaVoto(livro);
		votacaoService.atualizaVotacao(livro);
		return null;
	}	
}
 