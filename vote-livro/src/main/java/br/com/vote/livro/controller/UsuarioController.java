package br.com.vote.livro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping("/salvar")
	public String salvar(String email, String senha) {
		Usuario usuario = new Usuario(email, senha);
		usuarioService.salvar(usuario);
		return "usuario/ranking.usuario.jsp";
	}
}
