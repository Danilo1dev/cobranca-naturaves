package br.com.naturaves.cobrancanaturaves.funcionario.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class FuncionarioResponse {
	UUID idFuncionario;
}
