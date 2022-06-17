package br.com.josebarbosa.jpaUfla.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="PRODUTOS")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private String nome;
	private Double preco; 
	
	@ManyToMany
	@JoinTable(name="PRODUTO_CATEGORIA", 
	joinColumns = @JoinColumn(name="produto_id"),
	inverseJoinColumns = @JoinColumn(name="categoria_id"))
	@JsonManagedReference
	private List<Categoria> categorias = new ArrayList<>(); 
}
