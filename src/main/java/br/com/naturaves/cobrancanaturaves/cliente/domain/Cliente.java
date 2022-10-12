package br.com.naturaves.cobrancanaturaves.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import br.com.naturaves.cobrancanaturaves.cliente.application.api.ClienteAlteracaoRequest;
import br.com.naturaves.cobrancanaturaves.cliente.application.api.clienteRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)
	private UUID idCliente;

	@NotBlank
	@Column(unique = true)
	private String cliente;
	@NotBlank
	@Column(unique = true)
	private String nomeCliente;
	@Enumerated(EnumType.STRING)
	private InscricaoSocial inscricaoSocial;
	@NotBlank
	private String telefone;
	@Email
	private String email;
	@NotBlank
	private String nomeVendedor;
	@NotNull
	private LocalDate dataDoCadastro;

	private LocalDateTime dataHoraDaCadastro;
	private LocalDateTime dataHoraDoUltimaAlteracao;

	public Cliente(clienteRequest clienteRequest) {
		this.cliente = clienteRequest.getCodCliente();
		this.nomeCliente = clienteRequest.getRazaoSocial();
		this.inscricaoSocial = clienteRequest.getInscricaoSocial();
		this.telefone = clienteRequest.getTelefone();
		this.email = clienteRequest.getEmail();
		this.nomeVendedor = clienteRequest.getVendedor();
		this.dataDoCadastro = clienteRequest.getDataDoCadastro();
		this.dataHoraDaCadastro = LocalDateTime.now();
	}

	public void altera(ClienteAlteracaoRequest clienteAlteracaoRequest) {
		this.inscricaoSocial = clienteAlteracaoRequest.getInscricaoSocial();
		this.telefone = clienteAlteracaoRequest.getTelefone();
		this.email = clienteAlteracaoRequest.getEmail();
		this.nomeVendedor = clienteAlteracaoRequest.getVendedor();
		this.dataHoraDoUltimaAlteracao = LocalDateTime.now();
	}
}
