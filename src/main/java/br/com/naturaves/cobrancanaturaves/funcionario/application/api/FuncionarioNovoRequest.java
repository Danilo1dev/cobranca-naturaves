package br.com.naturaves.cobrancanaturaves.funcionario.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Value;

@Value
public class FuncionarioNovoRequest {
	@NotBlank
	@Size(min = 6)
	private String login;
	@NotBlank
	@Size(max = 4)
	private String senha;
}
