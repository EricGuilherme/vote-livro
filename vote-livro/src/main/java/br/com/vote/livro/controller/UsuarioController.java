package br.com.vote.livro.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.vote.livro.model.Livro;
import br.com.vote.livro.model.Usuario;
import br.com.vote.livro.model.Votacao;
import br.com.vote.livro.service.UsuarioService;
import br.com.vote.livro.service.VotacaoService;

@Controller
@RequestMapping("usuario/*")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	VotacaoService votacaoService;
	
	@RequestMapping("/")
	public String index() {
		return "usuario/usuario.index.jsp";
	}

	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public void salvar(Usuario usuario) {
		usuarioService.salvar(usuario);
	}
	
	@RequestMapping(value="/salvar", method=RequestMethod.GET)
	public String ranking(Usuario usuario, Model model){
		model.addAttribute("votacoes" , listar());
		return "usuario/ranking.usuario.jsp"; 
	}
	
	public List<Votacao> listar(){
		return votacaoService.listarVotacao();
	}
	
	
}
