package br.com.naturaves.cobrancanaturaves.cliente.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.naturaves.cobrancanaturaves.cliente.domain.Inscricao;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {

	private UUID idCliente;
	private String codCliente;
	private String razaoSocial;
	private Inscricao inscricao;
	private String telefone;
	private String email;
	private String vendedor;
	private LocalDate dataDoCadastro;
	
	public ClienteDetalhadoResponse(UUID idCliente, String codCliente, String razaoSocial, Inscricao inscricao,
			String telefone, String email, String vendedor, LocalDate dataDoCadastro) {
		
		this.idCliente = idCliente;
		this.codCliente = codCliente;
		this.razaoSocial = razaoSocial;
		this.inscricao = inscricao;
		this.telefone = telefone;
		this.email = email;
		this.vendedor = vendedor;
		this.dataDoCadastro = dataDoCadastro;
	}
}
