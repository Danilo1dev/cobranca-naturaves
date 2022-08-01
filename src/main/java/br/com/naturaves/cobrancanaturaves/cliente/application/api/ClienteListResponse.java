package br.com.naturaves.cobrancanaturaves.cliente.application.api;

import java.util.List;
import java.util.UUID;

import br.com.naturaves.cobrancanaturaves.cliente.domain.Cliente;
import br.com.naturaves.cobrancanaturaves.cliente.domain.Inscricao;

public class ClienteListResponse {

	private UUID idCliente;
	private String codCliente;
	private String razaoSocial;
	private Inscricao inscricao;
	private String telefone;
	private String email;
	private String vendedor;
	
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return null;
	}
}
