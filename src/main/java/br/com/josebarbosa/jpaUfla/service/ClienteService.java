package br.com.josebarbosa.jpaUfla.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.josebarbosa.jpaUfla.exception.ObjectNotFoundException;
import br.com.josebarbosa.jpaUfla.model.Cliente;
import br.com.josebarbosa.jpaUfla.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {

	private final ClienteRepository clienteRepository;
	
	public Cliente findClienteById(Integer id) {
		return this.clienteRepository.findById(id).orElseThrow(
				()-> new ObjectNotFoundException("Cliente não encontrado com o id: " + id)); 
	}
	public List<Cliente> findAll(){
		return this.clienteRepository.findAll(); 
	}
}
