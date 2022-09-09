package br.com.naturaves.cobrancanaturaves.cobranca.application.api;

import java.time.LocalDate;
import java.util.UUID;
import br.com.naturaves.cobrancanaturaves.cobranca.domain.Cobranca;
import lombok.Value;

@Value
public class CobrancaDetalhadoResponse {

	private UUID idCobranca;
	private UUID idBoleto;
	private Double valorNegociado;
	private String anotacao;
	private LocalDate dataDeRetorno;

	public CobrancaDetalhadoResponse(Cobranca cobranca) {
		this.idCobranca = cobranca.getIdCobranca();
		this.idBoleto = cobranca.getIdBoleto();
		this.valorNegociado = cobranca.getValorNegociado();
		this.anotacao = cobranca.getAnotacao();
		this.dataDeRetorno = cobranca.getDataDeRetorno();
	}	
}
