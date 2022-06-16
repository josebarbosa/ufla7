package br.com.josebarbosa.jpaUfla.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.josebarbosa.jpaUfla.dto.CategoriaDTO;
import br.com.josebarbosa.jpaUfla.model.Categoria;
import br.com.josebarbosa.jpaUfla.service.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaController {
	
	private ModelMapper modelMapper = new ModelMapper(); 
	
	@Autowired
	private CategoriaService categoriaService;
	
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

	@GetMapping(value= "/{id}")
	public ResponseEntity<?> buscarCategoriaById(@PathVariable Integer id){
		Categoria categoriaDTO = this.categoriaService.buscarCategoriaById(id);
		if(categoriaDTO != null) {
			return ResponseEntity.ok().body(categoriaDTO);
		}else {
			return ResponseEntity.badRequest().body("Categoria não encontrada com o id: " + id);
		}
	}
}
