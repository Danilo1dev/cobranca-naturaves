package br.com.naturaves.cobrancanaturaves.mock;

import java.time.LocalDateTime;
import java.util.UUID;
import br.com.naturaves.cobrancanaturaves.cliente.application.api.ClienteRequest;
import br.com.naturaves.cobrancanaturaves.cliente.domain.Cliente;

public class MockCliente {
	
	public static Cliente clienteBuild() {
		return Cliente.builder()
			.idCliente(UUID.randomUUID())
			.cliente("6719")
			.nomeCliente("Paulo Jose de Souza")
			.telefone("7391978258")
			.email("danilo@email.com")
			.nomeVendedor("Danilo Silva")
			.dataHoraDaCadastro(LocalDateTime.now())
			.build();
	}

	public static ClienteRequest clientRequestBuild() {
		return ClienteRequest.builder()
			.cliente("6719")
			.nomeCliente("Paulo Jose de Souza")
			.telefone("7391978258")
			.email("danilo@email.com")
			.nomeVendedor("Danilo Silva")
			.build();
	}
}
