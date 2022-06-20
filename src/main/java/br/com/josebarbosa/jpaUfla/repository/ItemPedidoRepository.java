package br.com.josebarbosa.jpaUfla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.josebarbosa.jpaUfla.model.ItemPedido;
import br.com.josebarbosa.jpaUfla.model.ItemPedidoPk;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPk>{

}
