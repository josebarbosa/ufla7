package br.com.josebarbosa.jpaUfla.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.josebarbosa.jpaUfla.model.Produto;
import br.com.josebarbosa.jpaUfla.service.ProdutoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value="/produtos")
@RequiredArgsConstructor
public class ProdutoController {

	private final ProdutoService produtoService; 
	
	@GetMapping
	public ResponseEntity<?> findAllProdutos(){
		List<Produto> allProdutos = this.produtoService.findAll();
		if(allProdutos != null) {
			return ResponseEntity.ok().body(allProdutos);
		}else {
			return ResponseEntity.badRequest().body("Não foram encontrados produtos!");
		}
	}
}
