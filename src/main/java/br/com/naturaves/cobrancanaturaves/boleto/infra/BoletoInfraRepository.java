package br.com.naturaves.cobrancanaturaves.boleto.infra;

import org.springframework.stereotype.Repository;

import br.com.naturaves.cobrancanaturaves.boleto.apllication.service.BoletoRepository;
import br.com.naturaves.cobrancanaturaves.boleto.domain.Boleto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BoletoInfraRepository implements BoletoRepository {
	private final BoletoSprindDataJPARepository boletoSpringDataJPARepository;
	
	@Override
	public Boleto salvaBoleto(Boleto boleto) {
		log.info("[inicia] BoletoInfraRepository - salvaBoleto");
		boletoSpringDataJPARepository.save(boleto);
		log.info("[finaliza] BoletoInfraRepository - salvaBoleto");
		return boleto;
	}
}
