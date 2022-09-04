package br.com.naturaves.cobrancanaturaves.cobranca.apllication.service;

import java.util.UUID;
import javax.validation.Valid;
import org.springframework.stereotype.Service;
import br.com.naturaves.cobrancanaturaves.cobranca.apllication.api.CobrancaRequest;
import br.com.naturaves.cobrancanaturaves.cobranca.apllication.api.CobrancaResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CobrancaApllicationService implements CobrancaService {

	@Override
	public CobrancaResponse criaCobranca(UUID idBoleto, @Valid CobrancaRequest cobrancaRequest) {
		log.info("[inicia] CobrancaApllicationService - criaCobranca");
		log.info("[finaliza] CobrancaApllicationService - criaCobranca");
		return null;
	}
}
