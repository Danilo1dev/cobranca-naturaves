package br.com.naturaves.cobrancanaturaves.boleto.apllication.service;

import br.com.naturaves.cobrancanaturaves.boleto.domain.Boleto;

public interface BoletoRepository {
	Boleto salvaBoleto(Boleto boleto);
}
