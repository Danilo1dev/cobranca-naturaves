package br.com.naturaves.cobrancanaturaves.cobranca.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import br.com.naturaves.cobrancanaturaves.cobranca.domain.Cobranca;
import lombok.Value;

@Value
public class CobrancaBoletoListResponse {
	private UUID idCobranca;
	private Double valorNegociado;
	private String anotacao;
	private LocalDate dataDeRetorno;
	
	public static List<CobrancaBoletoListResponse> converte(List<Cobranca> cobrancaDoBoleto) {
		return cobrancaDoBoleto.stream()
				.map(CobrancaBoletoListResponse::new)
				.collect(Collectors.toList());
	}

	public CobrancaBoletoListResponse(Cobranca cobranca) {
		this.idCobranca = cobranca.getIdCobranca();
		this.valorNegociado = cobranca.getValorNegociado();
		this.anotacao = cobranca.getAnotacao();
		this.dataDeRetorno = cobranca.getDataDeRetorno();
	}
}
