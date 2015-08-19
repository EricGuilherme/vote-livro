package br.com.vote.livro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.vote.livro.dao.UsuarioDao;
import br.com.vote.livro.model.Usuario;

@Service
public class UsuarioService {

	@Autowired
	UsuarioDao usuarioDao;
	
	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
	
	@Transactional
	public void salvar(Usuario usuario) {
		usuarioDao.salvar(usuario); 
	}

	public List<Usuario> listarVotacao(Usuario usuario) {
		return usuarioDao.listarVotacao(usuario);
	}

	public String validaLogin(String email, String senha) throws Exception {
		try {
			return "";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}
