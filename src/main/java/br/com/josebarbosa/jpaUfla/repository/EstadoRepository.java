package br.com.josebarbosa.jpaUfla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.josebarbosa.jpaUfla.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
