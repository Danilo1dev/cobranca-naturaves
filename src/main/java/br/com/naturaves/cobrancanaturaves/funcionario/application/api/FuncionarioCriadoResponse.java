package br.com.naturaves.cobrancanaturaves.funcionario.application.api;

import java.util.UUID;

import lombok.Value;

@Value
public class FuncionarioCriadoResponse {
	private UUID idFuncionario;
	private String nome;
	private String cargo;

	public FuncionarioCriadoResponse(UUID idFuncionario, String nome, String cargo) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.cargo = cargo;
	}
}
