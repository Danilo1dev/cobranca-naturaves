package br.com.naturaves.cobrancanaturaves.boleto.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.naturaves.cobrancanaturaves.boleto.domain.Boleto;

public interface BoletoSprindDataJPARepository extends JpaRepository<Boleto, UUID>{
}
