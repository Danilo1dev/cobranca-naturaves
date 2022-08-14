package br.com.naturaves.cobrancanaturaves.boleto.apllication.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.naturaves.cobrancanaturaves.boleto.apllication.api.BoletoRequest;
import br.com.naturaves.cobrancanaturaves.boleto.apllication.api.BoletoResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class BoletoApplicationService implements BoletoService {

	@Override
	public BoletoResponse criaBoleto(UUID idCliente, @Valid BoletoRequest boletoRequest) {
		log.info("[inicia] BoletoApplicationService - criaBoleto");
		log.info("[finaliza] BoletoApplicationService - criaBoleto");
		return null;
	}
}
