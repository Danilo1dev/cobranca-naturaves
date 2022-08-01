package br.com.naturaves.cobrancanaturaves.cliente.application.repository;

import java.util.List;

import br.com.naturaves.cobrancanaturaves.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
}
