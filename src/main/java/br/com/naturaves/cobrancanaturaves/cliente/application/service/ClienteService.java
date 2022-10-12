package br.com.naturaves.cobrancanaturaves.cliente.application.service;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import br.com.naturaves.cobrancanaturaves.cliente.application.api.ClienteAlteracaoRequest;
import br.com.naturaves.cobrancanaturaves.cliente.application.api.ClienteDetalhadoResponse;
import br.com.naturaves.cobrancanaturaves.cliente.application.api.ClienteListResponse;
import br.com.naturaves.cobrancanaturaves.cliente.application.api.ClienteResponse;
import br.com.naturaves.cobrancanaturaves.cliente.application.api.clienteRequest;

public interface ClienteService {
	ClienteResponse criaCliente(clienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesID(UUID idCliente);
	void deletaClienteAtravesID(UUID idCliente);
	void patchAlteracliente(UUID idCliente, @Valid ClienteAlteracaoRequest clienteAlteracaoRequest);
}
