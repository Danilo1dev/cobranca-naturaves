package br.com.naturaves.cobrancanaturaves.cliente.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.naturaves.cobrancanaturaves.cliente.domain.Cliente;
import br.com.naturaves.cobrancanaturaves.cliente.domain.Inscricao;
import lombok.Value;

@Value
public class ClienteListResponse {

	private UUID idCliente;
	private String codCliente;
	private String razaoSocial;
	private Inscricao inscricao;
	private String telefone;
	private String email;
	private String vendedor;

	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return clientes.stream()
				.map(ClienteListResponse::new)
				.collect(Collectors.toList());
}
	public ClienteListResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.codCliente = cliente.getCodCliente();
		this.razaoSocial = cliente.getRazaoSocial();
		this.inscricao = cliente.getInscricao();
		this.telefone = cliente.getTelefone();
		this.email = cliente.getEmail();
		this.vendedor = cliente.getVendedor();
	}
}
