package br.com.josebarbosa.jpaUfla.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.josebarbosa.jpaUfla.model.Cliente;
import br.com.josebarbosa.jpaUfla.service.ClienteService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value="/clientes")
@RequiredArgsConstructor
public class ClienteController {

	private final ClienteService clienteService;
	
	@GetMapping(value="/{id}")
	public Cliente findById(@PathVariable Integer id) {
		return this.clienteService.findClienteById(id);
	}
	
	@GetMapping
	public List<Cliente> findAll(){
		return this.clienteService.findAll();
	}
}
