package br.com.naturaves.cobrancanaturaves.cobranca.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.naturaves.cobrancanaturaves.cobranca.application.repository.CobrancaRepository;
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
		Cobranca cobrancaSalva = cobrancaSpringDataJPARepository.save(cobranca);
		log.info("[finaliza] CobrancaInfraRepository - salvaCobranca");
		return cobrancaSalva;
	}

	@Override
	public List<Cobranca> buscaCobrancaDoBoletoComId(UUID idBoleto) {
		log.info("[inicia] CobrancaInfraRepository - buscaCobrancaDoBoletoComId");
		var cobranca = cobrancaSpringDataJPARepository.findByIdBoleto(idBoleto);
		log.info("[finaliza] CobrancaInfraRepository - buscaCobrancaDoBoletoComId");
		return cobranca;
	}
}
