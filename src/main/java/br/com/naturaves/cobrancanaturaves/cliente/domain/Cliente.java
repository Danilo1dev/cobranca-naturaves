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

	public Cliente(UUID idCliente, @NotBlank String codCliente, @NotBlank String razaoSocial, Inscricao inscricao,
			@NotBlank String telefone, @Email String email, @NotBlank String vendedor,
			@NotNull LocalDate dataDoCadastro) {
		
		this.idCliente = UUID.randomUUID();
		this.codCliente = codCliente;
		this.razaoSocial = razaoSocial;
		this.inscricao = inscricao;
		this.telefone = telefone;
		this.email = email;
		this.vendedor = vendedor;
		this.dataDoCadastro = dataDoCadastro;
		this.dataHoraDaCadastro = LocalDateTime.now();
	}
}
