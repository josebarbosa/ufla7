package br.com.josebarbosa.jpaUfla.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PagamentoComCartao extends Pagamento{

	private Integer numeroDeParcelas; 
	
}
