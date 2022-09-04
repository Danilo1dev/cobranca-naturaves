package br.com.naturaves.cobrancanaturaves.cobranca.apllication.service;

import java.util.UUID;
import javax.validation.Valid;
import br.com.naturaves.cobrancanaturaves.cobranca.apllication.api.CobrancaRequest;
import br.com.naturaves.cobrancanaturaves.cobranca.apllication.api.CobrancaResponse;

public interface CobrancaService {
	CobrancaResponse criaCobranca(UUID idBoleto, @Valid CobrancaRequest cobrancaRequest);
}
