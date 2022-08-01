package br.com.naturaves.cobrancanaturaves.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.naturaves.cobrancanaturaves.cliente.application.api.ClienteResponse;
import br.com.naturaves.cobrancanaturaves.cliente.application.api.clienteRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
//@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(clienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		//Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		//return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
		return null;
	}

}
