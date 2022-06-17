package br.com.josebarbosa.jpaUfla.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String  cpfOuCnpj;
	private TipoCliente tipoCliente;
	
	@OneToMany(mappedBy = "cliente")
	@JsonManagedReference
	private List<Endereco> enderecos = new ArrayList<>();
	
	@JsonManagedReference
	@OneToMany(mappedBy = "cliente")
	private List<Telefone> telefones = new ArrayList<>();
}
