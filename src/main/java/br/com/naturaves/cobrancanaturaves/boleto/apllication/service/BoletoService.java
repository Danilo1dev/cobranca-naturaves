package br.com.naturaves.cobrancanaturaves.boleto.apllication.service;

import java.util.UUID;

import javax.validation.Valid;

import br.com.naturaves.cobrancanaturaves.boleto.apllication.api.BoletoRequest;
import br.com.naturaves.cobrancanaturaves.boleto.apllication.api.BoletoResponse;

public interface BoletoService {
	BoletoResponse criaBoleto(UUID idCliente, @Valid BoletoRequest boletoRequest);
}
