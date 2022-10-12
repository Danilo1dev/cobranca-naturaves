package br.com.naturaves.cobrancanaturaves.boleto.application.api;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import br.com.naturaves.cobrancanaturaves.boleto.domain.GrupoEmpresarial;
import lombok.Value;

@Value
public class BoletoRequest {
	@NotNull
	@NotBlank(message = "O numero do boleto não pode estar em branco")
	private String numeroBoleto;
	@NotNull
	@Size(max = 2)
	private String numeroDaParcela;
	@NotNull
	private LocalDate dataDoVencimento;
	@NotNull
	private Double valorDoBoleto;
	private GrupoEmpresarial grupoEmpresarial;
}
