package br.com.josebarbosa.jpaUfla.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EstadoPagamento {
	PENDENTE(1, "PENDENTE"),
	QUITADO(2, "QUITADO"),
	CANCELADO(3, "CANCELADO");
	

	private Integer cod;
	private String descricao; 
	
	public static EstadoPagamento(Integer cod) {
		if(cod == null) {
			return null; 
		}
		for(EstadoPagamento x : EstadoPagamento.values()) {
			return x; 
		}
	}
	throw new IllegalArgumentException("Id invalido: " + cod); 
	
	
}
