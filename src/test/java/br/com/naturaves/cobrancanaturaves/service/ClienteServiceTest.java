package br.com.naturaves.cobrancanaturaves.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import br.com.naturaves.cobrancanaturaves.cliente.application.api.ClienteResponse;
import br.com.naturaves.cobrancanaturaves.cliente.application.repository.ClienteRepository;
import br.com.naturaves.cobrancanaturaves.cliente.application.service.ClienteApplicationService;
import br.com.naturaves.cobrancanaturaves.mock.MockCliente;

@ExtendWith(MockitoExtension.class)
public class ClienteServiceTest {
	
	@InjectMocks
	private ClienteApplicationService clienteService;
	
	@Mock
	private ClienteRepository clienteRepository;
	
	@Test
	void testCreateClienteSucesso() {
		when (clienteRepository.salva(any())).thenReturn(MockCliente.clienteBuild());
		ClienteResponse clienteResponse = clienteService.criaCliente(MockCliente.clientRequestBuild());
		assertNotNull(clienteResponse);
	}
}
