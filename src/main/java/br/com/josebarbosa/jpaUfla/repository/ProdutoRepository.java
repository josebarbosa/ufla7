package br.com.josebarbosa.jpaUfla.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.josebarbosa.jpaUfla.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
