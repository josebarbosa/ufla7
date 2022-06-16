package br.com.josebarbosa.jpaUfla;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;

import br.com.josebarbosa.jpaUfla.model.Categoria;
import br.com.josebarbosa.jpaUfla.model.Produto;
import br.com.josebarbosa.jpaUfla.repository.CategoriaRepository;
import br.com.josebarbosa.jpaUfla.repository.ProdutoRepository;

@SpringBootApplication
public class Ufla7Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Ufla7Application.class, args);
	}

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Produto produto1 = Produto.builder()
				.nome("Computador")
				.preco(2000.0)
				.build();
		Produto produto2 = Produto.builder()
				.nome("Mouse")
				.preco(199.99)
				.build();
		
		Categoria categoria = Categoria.builder()
				.nome("Escritório").build();
		Categoria categoria1 = Categoria.builder()
				.nome("Papelaria")
				.build();
		this.categoriaRepository.saveAll(Arrays.asList(categoria, categoria1));
		
		produto1.setCategorias(Arrays.asList(categoria, categoria1));
		this.produtoRepository.save(produto1);
		produto2.setCategorias(Arrays.asList(categoria, categoria1));
		this.produtoRepository.save(produto2);
	}

}
