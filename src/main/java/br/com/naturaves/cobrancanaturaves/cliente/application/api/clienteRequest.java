package br.com.naturaves.cobrancanaturaves.cliente.application.api;

import java.time.LocalDate;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import br.com.naturaves.cobrancanaturaves.cliente.domain.InscricaoSocial;
import lombok.Value;

@Value
public class clienteRequest {
	@NotBlank
	private String codCliente;
	@NotBlank
	private String razaoSocial;
	private InscricaoSocial inscricaoSocial;
	@NotBlank
	private String telefone;
	@Email
	private String email;
	@NotBlank
	private String vendedor;
	@NotNull
	private LocalDate dataDoCadastro;
}
