package br.com.josebarbosa.jpaUfla.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.josebarbosa.jpaUfla.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	Optional<Produto> nome(String nome);
	Optional<Produto> preco(Double preco);
	
}
