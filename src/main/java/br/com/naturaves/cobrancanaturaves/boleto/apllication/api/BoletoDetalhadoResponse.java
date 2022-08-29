package br.com.naturaves.cobrancanaturaves.boleto.apllication.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.naturaves.cobrancanaturaves.boleto.domain.GrupoEmpresarial;
import lombok.Value;

@Value
public class BoletoDetalhadoResponse {
	private UUID idBoleto;
	private String numeroBoleto;
	private String numeroDaParcela;
	private LocalDate dataDoVencimento;
	private Double valorDoBoleto;
	private GrupoEmpresarial grupoEmpresarial;
	private LocalDateTime dataHoraDaCadastro;
}
