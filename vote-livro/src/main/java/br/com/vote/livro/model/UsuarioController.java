package br.com.vote.livro.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.vote.livro.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping
	@ResponseBody
	public String salvar(String nome, String email){
		Usuario usuario = usuarioService.salvar(nome, email);
		return "Obrigado " + usuario.getNome() + " !";
	}
	
}
