import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.mockito.InjectMocks;

import br.com.vote.livro.model.Usuario;
import br.com.vote.livro.service.UsuarioService;

public class UsuarioServiceTest {

	@InjectMocks
	UsuarioService usuarioService;

	@Test
	public void deveSalvarUsuario(){
		Usuario usuario = criaUsuario(1);
		assertNotEquals(null, usuario);
	}
	
	public Usuario criaUsuario(int usuarioKey){
		Usuario usuario = new Usuario();
		usuario.setUsuarioKey(usuarioKey);
		usuario.setNome("Eric Guilherme");
		usuario.setEmail("guilherme@gmail.com");
		
		return usuario;
	}
}
