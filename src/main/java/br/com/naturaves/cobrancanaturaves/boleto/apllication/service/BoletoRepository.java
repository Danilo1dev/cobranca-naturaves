package br.com.naturaves.cobrancanaturaves.boleto.apllication.service;

import java.util.List;
import java.util.UUID;
import br.com.naturaves.cobrancanaturaves.boleto.domain.Boleto;

public interface BoletoRepository {
	Boleto salvaBoleto(Boleto boleto);
	List<Boleto> buscaBoletoDoClienteComId(UUID idCliente);
}
