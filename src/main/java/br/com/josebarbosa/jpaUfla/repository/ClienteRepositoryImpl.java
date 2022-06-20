package br.com.josebarbosa.jpaUfla.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.josebarbosa.jpaUfla.model.Cliente;

@Repository
public class ClienteRepositoryImpl {

	@PersistenceContext
	private EntityManager manager;
	
	public List<Cliente> findNome(String nome){
		String jpql = "from Cliente where nome like :nome";
		return manager
				.createQuery(jpql, Cliente.class)
				.setParameter("nome", nome)
				.getResultList(); 
	}
}
