package br.com.vote.livro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.vote.livro.model.Usuario;
import br.com.vote.livro.service.UsuarioService;

@Controller
@RequestMapping("usuario/*")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("/")
	public String index() {
		return "usuario/usuario.index.jsp";
	}

	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public void salvar(Usuario usuario) {
		usuarioService.salvar(usuario);
		ranking();
	}
	
	@RequestMapping(value="/salvar", method=RequestMethod.GET)
	public String ranking(){
		
		return "usuario/ranking.usuario.jsp"; 
	}
	
}
