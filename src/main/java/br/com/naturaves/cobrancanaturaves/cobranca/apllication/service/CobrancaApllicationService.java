package br.com.naturaves.cobrancanaturaves.cobranca.apllication.service;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.stereotype.Service;
import br.com.naturaves.cobrancanaturaves.boleto.apllication.service.BoletoService;
import br.com.naturaves.cobrancanaturaves.cobranca.apllication.api.CobrancaBoletoListResponse;
import br.com.naturaves.cobrancanaturaves.cobranca.apllication.api.CobrancaRequest;
import br.com.naturaves.cobrancanaturaves.cobranca.apllication.api.CobrancaResponse;
import br.com.naturaves.cobrancanaturaves.cobranca.apllication.repository.CobrancaRepository;
import br.com.naturaves.cobrancanaturaves.cobranca.domain.Cobranca;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class CobrancaApllicationService implements CobrancaService {
	private final BoletoService boletoService;
	private final CobrancaRepository cobrancaRepository;
	
	@Override
	public CobrancaResponse criaCobranca(UUID idBoleto, @Valid CobrancaRequest cobrancaRequest) {
		log.info("[inicia] CobrancaApllicationService - criaCobranca");
		boletoService.buscaBoletoDoClienteComId(idBoleto);
		Cobranca cobranca = cobrancaRepository.salvaCobranca(new Cobranca(idBoleto, cobrancaRequest));
		log.info("[finaliza] CobrancaApllicationService - criaCobranca");
		return new CobrancaResponse(cobranca.getIdCobranca());
	}

	@Override
	public List<CobrancaBoletoListResponse> buscaCobrancaDoBoletoComId(UUID idBoleto) {
		log.info("[inicia] CobrancaApllicationService - buscaCobrancaDoBoletoComId");
		boletoService.buscaBoletoDoClienteComId(idBoleto);
		log.info("[finaliza] CobrancaApllicationService - buscaCobrancaDoBoletoComId");
		return null;
	}
}