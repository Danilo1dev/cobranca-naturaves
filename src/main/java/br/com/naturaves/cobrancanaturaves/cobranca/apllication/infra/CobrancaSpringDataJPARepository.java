package br.com.naturaves.cobrancanaturaves.cobranca.apllication.infra;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.naturaves.cobrancanaturaves.cobranca.domain.Cobranca;

public interface CobrancaSpringDataJPARepository extends JpaRepository<Cobranca, UUID>{
}
