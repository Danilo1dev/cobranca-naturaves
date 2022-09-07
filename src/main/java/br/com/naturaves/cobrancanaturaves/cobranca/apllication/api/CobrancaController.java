package br.com.naturaves.cobrancanaturaves.cobranca.apllication.api;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RestController;
import br.com.naturaves.cobrancanaturaves.cobranca.apllication.service.CobrancaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class CobrancaController implements CobrancaAPI {
	private final CobrancaService cobrancaService;
	
	@Override
	public CobrancaResponse postCobranca(UUID idBoleto, @Valid CobrancaRequest cobrancaRequest) {
		log.info("[inicia] CobrancaController - postCobranca");
		log.info("[idBoleto]{}",idBoleto);
		CobrancaResponse cobranca = cobrancaService.criaCobranca(idBoleto,cobrancaRequest);
		log.info("[finaliza] CobrancaController - postCobranca");
		return cobranca;
	}

	@Override
	public List<CobrancaBoletoListResponse> getCobrancaDoBoletoComId(UUID idBoleto) {
		log.info("[inicia] CobrancaController - getCobrancaDoBoletoComId");
		log.info("[idBoleto]{}",idBoleto);
		List<CobrancaBoletoListResponse> cobrancaDoBoleto = cobrancaService.buscaCobrancaDoBoletoComId(idBoleto);
		log.info("[finaliza] CobrancaController - getCobrancaDoBoletoComId");
		return cobrancaDoBoleto;
	}
}
