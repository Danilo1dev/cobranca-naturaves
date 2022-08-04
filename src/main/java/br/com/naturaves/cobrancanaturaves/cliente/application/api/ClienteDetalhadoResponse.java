package br.com.naturaves.cobrancanaturaves.cliente.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.naturaves.cobrancanaturaves.cliente.domain.Cliente;
import br.com.naturaves.cobrancanaturaves.cliente.domain.InscricaoSocial;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {

	private UUID idCliente;
	private String codCliente;
	private String razaoSocial;
	private InscricaoSocial inscricaoSocial;
	private String telefone;
	private String email;
	private String vendedor;
	private LocalDate dataDoCadastro;

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.codCliente = cliente.getCodCliente();
		this.razaoSocial = cliente.getRazaoSocial();
		this.inscricaoSocial = cliente.getInscricaoSocial();
		this.telefone = cliente.getTelefone();
		this.email = cliente.getEmail();
		this.vendedor = cliente.getVendedor();
		this.dataDoCadastro = cliente.getDataDoCadastro();
	}
}
