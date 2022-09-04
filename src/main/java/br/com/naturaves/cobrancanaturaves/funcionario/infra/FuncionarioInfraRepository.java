package br.com.naturaves.cobrancanaturaves.funcionario.infra;

import org.springframework.stereotype.Repository;

import br.com.naturaves.cobrancanaturaves.funcionario.application.repository.FuncionarioRepository;
import br.com.naturaves.cobrancanaturaves.funcionario.domain.Funcionario;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
public class FuncionarioInfraRepository implements FuncionarioRepository {

	@Override
	public Funcionario salva(Funcionario funcionario) {
		log.info("[inicia]ClienteInfraRepository - salva");
		log.info("[finaliza]ClienteInfraRepository - salva");
		return null;
	}
}
