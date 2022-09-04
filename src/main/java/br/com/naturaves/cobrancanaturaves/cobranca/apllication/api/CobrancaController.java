package br.com.naturaves.cobrancanaturaves.cobranca.apllication.api;

import java.util.UUID;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class CobrancaController implements CobrancaAPI {

	@Override
	public CobrancaResponse postCobranca(UUID idBoleto, @Valid CobrancaRequest cobrancaRequest) {
		log.info("[inicia] CobrancaController - postCobranca");
		log.info("[idBoleto]{}",idBoleto);
		log.info("[finaliza] CobrancaController - postCobranca");
		return null;
	}
}
