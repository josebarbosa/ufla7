package br.com.josebarbosa.jpaUfla.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.josebarbosa.jpaUfla.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	List<Cliente> findNome(String nome); 
}
