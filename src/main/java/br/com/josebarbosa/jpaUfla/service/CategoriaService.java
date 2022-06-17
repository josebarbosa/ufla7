package br.com.josebarbosa.jpaUfla.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.josebarbosa.jpaUfla.dto.CategoriaDTO;
import br.com.josebarbosa.jpaUfla.exception.ObjectNotFoundException;
import br.com.josebarbosa.jpaUfla.model.Categoria;
import br.com.josebarbosa.jpaUfla.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	public Categoria buscarCategoriaById(Integer id) {
		Optional<Categoria> categoria = this.categoriaRepository.findById(id);
		Categoria categoria1 = categoria.
				orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado, id: " + id));
		return categoria.orElse(null);
	}
	
	private CategoriaDTO mapEntityToDTO(Categoria categoria) {
		return this.modelMapper.map(categoria, CategoriaDTO.class);
	}
}
