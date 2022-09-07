package br.com.naturaves.cobrancanaturaves.cobranca.apllication.repository;

import java.util.List;
import java.util.UUID;
import br.com.naturaves.cobrancanaturaves.cobranca.domain.Cobranca;

public interface CobrancaRepository {
	Cobranca salvaCobranca(Cobranca cobranca);
	List<Cobranca> buscaCobrancaDoBoletoComId(UUID idBoleto);
}
