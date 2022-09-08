package br.com.naturaves.cobrancanaturaves.cobranca.application.api;

import java.time.LocalDate;
import java.util.UUID;
import lombok.Value;

@Value
public class CobrancaDetalhadoResponse {
	
	private UUID idCobranca;
	private UUID idBoleto;
	private Double valorNegociado;
	private String anotacao;
	private LocalDate dataDeRetorno;
}
