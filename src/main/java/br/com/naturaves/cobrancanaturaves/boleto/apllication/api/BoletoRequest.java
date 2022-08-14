package br.com.naturaves.cobrancanaturaves.boleto.apllication.api;

import java.time.LocalDate;

import javax.persistence.Lob;
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
	@NotNull
	private Double valorNegociado;
	private GrupoEmpresarial grupoEmpresarial;
	@NotNull
	private LocalDate dataDoContato;
	@NotNull
	private LocalDate dataDoRetorno;
	@NotBlank(message = "Por favor insira uma anotação")
	@Lob
	private String anotacao;
}
