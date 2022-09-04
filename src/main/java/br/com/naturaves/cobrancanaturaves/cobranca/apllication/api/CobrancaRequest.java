package br.com.naturaves.cobrancanaturaves.cobranca.apllication.api;

import java.time.LocalDate;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Value;

@Value
public class CobrancaRequest {
	
	@NotNull
	@NotBlank(message = "Insira o valor negociado")
	private Double valorNegociado;
	@NotNull
	@NotBlank(message = "Insira uma descrição")
	@Lob
	@Size(max = 200)
	private String anotacao;
	private LocalDate dataDeRetorno;
}
