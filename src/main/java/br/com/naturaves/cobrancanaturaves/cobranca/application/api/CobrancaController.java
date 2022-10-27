package br.com.naturaves.cobrancanaturaves.cobranca.application.api;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RestController;
import br.com.naturaves.cobrancanaturaves.boleto.application.repository.BoletoRepository;
import br.com.naturaves.cobrancanaturaves.boleto.domain.Boleto;
import br.com.naturaves.cobrancanaturaves.cliente.application.repository.ClienteRepository;
import br.com.naturaves.cobrancanaturaves.cliente.domain.Cliente;
import br.com.naturaves.cobrancanaturaves.cobranca.application.repository.CobrancaRepository;
import br.com.naturaves.cobrancanaturaves.cobranca.application.service.CobrancaService;
import br.com.naturaves.cobrancanaturaves.cobranca.domain.Cobranca;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class CobrancaController implements CobrancaAPI {
	private final CobrancaService cobrancaService;
    private final CobrancaRepository cobrancaRepository;
    private final BoletoRepository boletoRepository;
    private final ClienteRepository clienteRepository;
	
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

	@Override
	public CobrancaDetalhadoResponse getCobrancaAtravesId(UUID idBoleto, UUID idCobranca) {
		log.info("[inicia] CobrancaController - getCobrancaAtravesId");
		log.info("[idBoleto]{} - [idCobranca]{}", idBoleto, idCobranca);
		CobrancaDetalhadoResponse cobranca = cobrancaService.buscaCobrancaDoBoletoComId(idBoleto,idCobranca);
		log.info("[finaliza] CobrancaController - getCobrancaAtravesId");
		return cobranca;
	}
	
	public CobrancaBoletoByClienteResponse getCobrancaBoletoByCliente (UUID idCobranca) {
	    log.info("[inicia] CobrancaController - getCobrancaBoletoByCliente");
        log.info("[idCobranca]{}", idCobranca);
	    Cobranca cobrancaById = cobrancaRepository.buscaCobrancaComId(idCobranca);
	    Boleto boletoById = boletoRepository.buscaBoletoPeloId(cobrancaById.getIdBoleto());
	    Cliente clienteById = clienteRepository.buscaClienteAtravesId(boletoById.getIdClienteComercial());
        log.info("CobrancaController - Passagem - getCobrancaBoletoByCliente ");
	    CobrancaBoletoByClienteResponse cobrancaBoletoByClienteResponse = 
	            new CobrancaBoletoByClienteResponse(clienteById,boletoById,cobrancaById);
	    log.info("[finaliza] CobrancaController - getCobrancaBoletoByCliente");
	    return cobrancaBoletoByClienteResponse;
	}

	@Override
	public void deletaCobrancaDoBoletoComId(UUID idBoleto, UUID idCobranca) {
		log.info("[inicia] CobrancaController - deletaCobrancaDoBoletoComId");
		log.info("[idBoleto]{} - [idCobranca]{}", idBoleto, idCobranca);
		cobrancaService.deletaCobrancaDoBoletoComId(idBoleto,idCobranca);
		log.info("[finaliza] CobrancaController - deletaCobrancaDoBoletoComId");
	}

	@Override
	public void patchCobranca(UUID idBoleto, UUID idCobranca,
			@Valid CobrancaAlteracaoRequest cobrancaAlteracaoRequest) {
		log.info("[inicia] CobrancaController - patchCobranca");
		log.info("[idBoleto]{} - [idCobranca]{}", idBoleto, idCobranca);
		cobrancaService.alteraCobrancaDoBoletoComId(idBoleto,idCobranca, cobrancaAlteracaoRequest);
		log.info("[finaliza] CobrancaController - patchCobranca");
	}
}
