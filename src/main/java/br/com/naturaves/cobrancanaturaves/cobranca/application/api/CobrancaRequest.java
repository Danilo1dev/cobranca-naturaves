package br.com.naturaves.cobrancanaturaves.cobranca.application.api;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Value;

@Value
public class CobrancaRequest {
	@NotNull
	private Double valorNegociado;
	@NotNull
	@NotBlank(message = "Insira uma descrição")
	@Size(max = 200)
	private String anotacao;
	private LocalDate dataDeRetorno;
}
