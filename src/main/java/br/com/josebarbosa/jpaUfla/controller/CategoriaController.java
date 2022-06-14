package br.com.josebarbosa.jpaUfla.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.josebarbosa.jpaUfla.dto.CategoriaDTO;
import br.com.josebarbosa.jpaUfla.model.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaController {
	
	private ModelMapper modelMapper = new ModelMapper(); 
	
	@GetMapping
	public ResponseEntity<List<CategoriaDTO>> listarCategorias(){
		
		Categoria categoria = Categoria.builder()
				.id(1)
				.nome("Papelaria")
				.build();
		Categoria categoria2 = Categoria.builder()
				.id(2)
				.nome("Informática")
				.build();
		CategoriaDTO categoriaDTO = this.modelMapper.map(categoria, CategoriaDTO.class);
		CategoriaDTO categoriaDTO2 = this.modelMapper.map(categoria2, CategoriaDTO.class);
		
		List<CategoriaDTO> all = new ArrayList<>();
		all.addAll(Arrays.asList(categoriaDTO,categoriaDTO2));
		
		return ResponseEntity.ok(all);
	}

}
