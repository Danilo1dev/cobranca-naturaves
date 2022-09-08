package br.com.naturaves.cobrancanaturaves.cobranca.application.service;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.stereotype.Service;
import br.com.naturaves.cobrancanaturaves.boleto.application.service.BoletoService;
import br.com.naturaves.cobrancanaturaves.cobranca.application.api.CobrancaBoletoListResponse;
import br.com.naturaves.cobrancanaturaves.cobranca.application.api.CobrancaRequest;
import br.com.naturaves.cobrancanaturaves.cobranca.application.api.CobrancaResponse;
import br.com.naturaves.cobrancanaturaves.cobranca.application.repository.CobrancaRepository;
import br.com.naturaves.cobrancanaturaves.cobranca.domain.Cobranca;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class CobrancaApplicationService implements CobrancaService {
	private final BoletoService boletoService;
	private final CobrancaRepository cobrancaRepository;
	
	@Override
	public CobrancaResponse criaCobranca(UUID idBoleto, @Valid CobrancaRequest cobrancaRequest) {
		log.info("[inicia] CobrancaApplicationService - criaCobranca");
		boletoService.buscaBoletoComIdBoleto(idBoleto);
		Cobranca novaCobranca = new Cobranca(idBoleto, cobrancaRequest);
		Cobranca cobranca = cobrancaRepository.salvaCobranca(novaCobranca);
		log.info("[finaliza] CobrancaApplicationService - criaCobranca");
		return new CobrancaResponse(cobranca.getIdCobranca());
	}

	@Override
	public List<CobrancaBoletoListResponse> buscaCobrancaDoBoletoComId(UUID idBoleto) {
		log.info("[inicia] CobrancaApplicationService - buscaCobrancaDoBoletoComId");
		boletoService.buscaBoletoDoClienteComId(idBoleto);
		List<Cobranca> cobrancaDoBoleto = cobrancaRepository.buscaCobrancaDoBoletoComId(idBoleto); 
		log.info("[finaliza] CobrancaApplicationService - buscaCobrancaDoBoletoComId");
		return CobrancaBoletoListResponse.converte(cobrancaDoBoleto);
	}
}