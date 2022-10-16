package br.com.naturaves.cobrancanaturaves.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import br.com.naturaves.cobrancanaturaves.cliente.application.api.ClienteDetalhadoResponse;
import br.com.naturaves.cobrancanaturaves.cliente.application.api.ClienteResponse;
import br.com.naturaves.cobrancanaturaves.cliente.application.service.ClienteApplicationService;
import br.com.naturaves.cobrancanaturaves.cliente.infra.ClienteInfraRepository;
import br.com.naturaves.cobrancanaturaves.mock.MockCliente;

@ExtendWith(MockitoExtension.class)
public class ClienteServiceTest {

	@InjectMocks
	private ClienteApplicationService clienteService;
	@Mock
    private ClienteInfraRepository clienteRepository;

	@Test
	void testCreateClientSucess() {
		when (clienteRepository.salva(any())).thenReturn(MockCliente.clienteBuild());
		ClienteResponse clienteResponse = clienteService.criaCliente(MockCliente.clientRequestBuild());
		assertNotNull(clienteResponse);
	}
	
	@Test
	void testFindByIDSucess() {
		when (clienteRepository.buscaClienteAtravesId(any())).thenReturn(MockCliente.clienteBuild());
		ClienteDetalhadoResponse clienteResponse = clienteService.buscaClienteAtravesID(UUID.randomUUID());
		assertNotNull(clienteResponse);
	}

	@Test
	void testFindByIDNotFound() {
		when (clienteRepository.buscaClienteAtravesId(any())).thenThrow(new RuntimeException("Cliente não encontrado pelo idCliente"));
		RuntimeException exception = assertThrows(RuntimeException.class, () -> clienteService.buscaClienteAtravesID(UUID.randomUUID()));
		assertNotNull(exception);
	    assertEquals("Cliente não encontrado pelo idCliente", exception.getMessage());
	}

	@Test
	void testDeleteWhithSucess() {
	    when (clienteRepository.buscaClienteAtravesId(any())).thenReturn(MockCliente.clienteBuild());
	    doNothing().when(clienteRepository).deletaCliente(any());
	    clienteService.deletaClienteAtravesID(UUID.randomUUID());
	    verify(clienteRepository,times(1)).deletaCliente(any());
	}
	@Test
	void testDeleteWhithNotFoundException() {
	    when (clienteRepository.buscaClienteAtravesId(any())).thenThrow(new RuntimeException("Cliente não encontrado pelo idCliente"));
	    try {
	        clienteService.deletaClienteAtravesID(UUID.randomUUID());
	    }catch (Exception ex) {
	     assertEquals("Cliente não encontrado pelo idCliente", ex.getMessage());
	    }
	}
}


