package br.com.naturaves.cobrancanaturaves.cobranca.apllication.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;
import br.com.naturaves.cobrancanaturaves.cobranca.apllication.repository.CobrancaRepository;
import br.com.naturaves.cobrancanaturaves.cobranca.domain.Cobranca;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class CobrancaInfraRepository implements CobrancaRepository {
	private final CobrancaSpringDataJPARepository cobrancaSpringDataJPARepository;
	
	@Override
	public Cobranca salvaCobranca(Cobranca cobranca) {
		log.info("[inicia] CobrancaInfraRepository - salvaCobranca");
		cobrancaSpringDataJPARepository.save(cobranca);
		log.info("[finaliza] CobrancaInfraRepository - salvaCobranca");
		return cobranca;
	}

	@Override
	public List<Cobranca> buscaCobrancaDoBoletoComId(UUID idBoleto) {
		log.info("[inicia] CobrancaInfraRepository - buscaCobrancaDoBoletoComId");
		log.info("[finaliza] CobrancaInfraRepository - buscaCobrancaDoBoletoComId");
		return null;
	}
}
