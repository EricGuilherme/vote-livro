package br.com.vote.livro.ff.template;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import br.com.vote.livro.model.Livro;
import br.com.vote.livro.model.Usuario;

public class LivroTemplate implements TemplateLoader {

	@Override
	public void load() {

		Fixture.of(Livro.class).addTemplate("valido", new Rule(){{
			add("livroKey", random(Integer.class, range(1, 5)));
			add("nome", random("Harry Potter", "O monge e o Executivo"));
			add("imagem", "C://Documents/imagem/livro.jpeg");
			add("usuario", one(Usuario.class, "valido"));
//			add("usuarios", has(3).of(Usuario.class, "valido"));
		}});
		
		Fixture.of(Usuario.class).addTemplate("valido", new Rule(){{
			add("usuarioKey", random(Integer.class, range(1, 10)));
			add("email", "${nickName}@gmail.com");
			add("senha", random(Integer.class, range(1, 100)));
		}});
	}
}
