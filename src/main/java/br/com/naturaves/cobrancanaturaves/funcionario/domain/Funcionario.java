package br.com.naturaves.cobrancanaturaves.funcionario.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

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
	@Column(unique = true)
	private String cargo;

	private LocalDateTime dataHoraDaCadastro;

	public Funcionario(UUID idFuncionario, @NotBlank String nome, @NotBlank String cargo) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.cargo = cargo;
	}
}
