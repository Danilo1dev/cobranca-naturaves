package br.com.naturaves.cobrancanaturaves.cobranca.application.service;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import br.com.naturaves.cobrancanaturaves.cobranca.application.api.CobrancaBoletoListResponse;
import br.com.naturaves.cobrancanaturaves.cobranca.application.api.CobrancaRequest;
import br.com.naturaves.cobrancanaturaves.cobranca.application.api.CobrancaResponse;

public interface CobrancaService {
	CobrancaResponse criaCobranca(UUID idBoleto, @Valid CobrancaRequest cobrancaRequest);
	List<CobrancaBoletoListResponse> buscaCobrancaDoBoletoComId(UUID idBoleto);
}