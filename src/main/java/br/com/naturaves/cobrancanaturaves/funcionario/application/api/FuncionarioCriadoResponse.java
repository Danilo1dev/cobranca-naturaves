package br.com.naturaves.cobrancanaturaves.funcionario.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class FuncionarioCriadoResponse {
	private UUID idFuncionario;
	private String nome;
	private String cargo;
}
