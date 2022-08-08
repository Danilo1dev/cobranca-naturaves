package br.com.naturaves.cobrancanaturaves.funcionario.application.api;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Value;

@Value
public class FuncionarioNovoRequest {
	
	@NotBlank
	private String nome;
	@NotBlank
	private String cargo;
	@NotBlank
	@Email
	private String emailCorporativo;
	@NotBlank
	@Size(max = 4)
	private String senha;
}
