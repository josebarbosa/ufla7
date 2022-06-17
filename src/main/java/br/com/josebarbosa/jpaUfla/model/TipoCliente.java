package br.com.josebarbosa.jpaUfla.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoCliente {

	PESSOAFISICA (0, "Pessoa Física"),
	PESSOAJURIDICA (1, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	public static TipoCliente(int cod) {
		if(cod == null){
			return null; 
		}
		for(TipoCliente x: TipoCliente.values()){
			if(cod.equals(x.getCod())) {
				return x; 
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod); 
	}
	
}
