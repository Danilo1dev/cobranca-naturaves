package br.com.naturaves.cobrancanaturaves.cliente.application.service;

import br.com.naturaves.cobrancanaturaves.cliente.application.api.ClienteResponse;
import br.com.naturaves.cobrancanaturaves.cliente.application.api.clienteRequest;

public interface ClienteService {
	ClienteResponse criaCliente(clienteRequest clienteRequest);
}
