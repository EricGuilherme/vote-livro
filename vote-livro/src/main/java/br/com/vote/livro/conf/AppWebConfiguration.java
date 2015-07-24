package br.com.vote.livro.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.vote.livro.controllers.HomeController;
import br.com.vote.livro.dao.UsuarioDao;
import br.com.vote.livro.service.LivroService;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class, LivroService.class, UsuarioDao.class})
public class AppWebConfiguration {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){ 
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		
		resolver.setPrefix("/WEB-INF/views/");
		return resolver;
	}

}
