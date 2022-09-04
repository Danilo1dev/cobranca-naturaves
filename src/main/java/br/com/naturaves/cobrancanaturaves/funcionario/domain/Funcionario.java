package br.com.naturaves.cobrancanaturaves.funcionario.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import br.com.naturaves.cobrancanaturaves.funcionario.application.api.FuncionarioRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idFuncionario", updatable = false, unique = true, nullable = false)
	private UUID idFuncionario;

	@NotBlank
	@Column(unique = true)
	private String nome;
	@NotBlank
	private String cargo;
	@Column(unique = true)
	private String emailCorporativo;
	
	private LocalDateTime dataHoraDaCadastro;
	private LocalDateTime dataHoraDoUltimaAlteracao;

	public Funcionario(FuncionarioRequest funcionarioRequest) {
		this.nome = funcionarioRequest.getNome();
		this.cargo = funcionarioRequest.getCargo();
		this.emailCorporativo = funcionarioRequest.getEmailCorporativo();
		this.dataHoraDaCadastro = LocalDateTime.now();
	}
}
