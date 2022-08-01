package br.com.naturaves.cobrancanaturaves.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idCliente;

	@NotBlank
	private String codCliente;
	@NotBlank
	private String razaoSocial;
	private Inscricao inscricao;
	@NotBlank
	private String telefone;
	@Email
	private String email;
	@NotBlank
	private String vendedor;
	@NotNull
	private LocalDate dataDoCadastro;

	private LocalDateTime dataHoraDaCadastro;
	private LocalDateTime dataHoraDoUltimaAlteracao;

	public Cliente(clienteRequest clienteRequest) {
		this.codCliente = clienteRequest.getCodCliente();
		this.razaoSocial = clienteRequest.getRazaoSocial();
		this.inscricao = clienteRequest.getInscricao();
		this.telefone = clienteRequest.getTelefone();
		this.email = clienteRequest.getEmail();
		this.vendedor = clienteRequest.getVendedor();
		this.dataDoCadastro = clienteRequest.getDataDoCadastro();
		this.dataHoraDaCadastro = LocalDateTime.now();
	}
}
