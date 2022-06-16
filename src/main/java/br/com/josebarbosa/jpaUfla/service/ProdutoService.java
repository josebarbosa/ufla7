package br.com.josebarbosa.jpaUfla.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.josebarbosa.jpaUfla.model.Produto;
import br.com.josebarbosa.jpaUfla.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoService {

	private final ProdutoRepository produtoRepository;
	
	public Produto save(Produto produto) {
		return this.produtoRepository.save(produto);
	}
	
	public List<Produto> findAll(){
		return this.produtoRepository.findAll();
	}
}
