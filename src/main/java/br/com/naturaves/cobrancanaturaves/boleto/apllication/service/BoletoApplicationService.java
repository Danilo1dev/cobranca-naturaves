package br.com.naturaves.cobrancanaturaves.boleto.apllication.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.naturaves.cobrancanaturaves.boleto.apllication.api.BoletoClienteListResponse;
import br.com.naturaves.cobrancanaturaves.boleto.apllication.api.BoletoDetalhadoResponse;
import br.com.naturaves.cobrancanaturaves.boleto.apllication.api.BoletoRequest;
import br.com.naturaves.cobrancanaturaves.boleto.apllication.api.BoletoResponse;
import br.com.naturaves.cobrancanaturaves.boleto.domain.Boleto;
import br.com.naturaves.cobrancanaturaves.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoletoApplicationService implements BoletoService {
	private final ClienteService clienteService;
	private final BoletoRepository boletoRepository;

	@Override
	public BoletoResponse criaBoleto(UUID idCliente, @Valid BoletoRequest boletoRequest) {
		log.info("[inicia] BoletoApplicationService - criaBoleto");
		clienteService.buscaClienteAtravesID(idCliente);
		Boleto boleto = boletoRepository.salvaBoleto(new Boleto(idCliente, boletoRequest));
		log.info("[finaliza] BoletoApplicationService - criaBoleto");
		return new BoletoResponse(boleto.getIdBoleto());
	}

	@Override
	public List<BoletoClienteListResponse> buscaBoletoDoClienteComId(UUID idCliente) {
		log.info("[inicia] BoletoApplicationService - buscaBoletoDoClienteComId");
		clienteService.buscaClienteAtravesID(idCliente);
		List<Boleto> boletoDoCliente = boletoRepository.buscaBoletoDoClienteComId(idCliente);
		log.info("[finaliza] BoletoApplicationService - buscaBoletoDoClienteComId");
		return BoletoClienteListResponse.converte(boletoDoCliente);
	}

	@Override
	public BoletoDetalhadoResponse buscaBoletoDoClienteComId(UUID idCliente, UUID idBoleto) {
		log.info("[inicia] BoletoApplicationService - buscaBoletoDoClienteComId");
		Boleto boleto = boletoRepository.buscaBoletoPeloId(idBoleto);
		log.info("[finaliza] BoletoApplicationService - buscaBoletoDoClienteComId");
		return new BoletoDetalhadoResponse(boleto);
	}
}
