package br.com.naturaves.cobrancanaturaves.funcionario.application.service;

import org.springframework.stereotype.Service;

import br.com.naturaves.cobrancanaturaves.funcionario.application.api.FuncionarioRequest;
import br.com.naturaves.cobrancanaturaves.funcionario.application.api.FuncionarioResponse;
import br.com.naturaves.cobrancanaturaves.funcionario.application.repository.FuncionarioRepository;
import br.com.naturaves.cobrancanaturaves.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
	private final FuncionarioRepository funcionarioRepository;

	@Override
	public FuncionarioResponse criaNovoFuncionario(FuncionarioRequest funcionarioRequest) {
		log.info("[inicia] FuncionarioApplicationService - criaNovoFuncionario");
		Funcionario funcionario  = funcionarioRepository.salva(new Funcionario(funcionarioRequest));
		log.info("[finaliza] FuncionarioApplicationService - criaNovoFuncionario");
		return FuncionarioResponse.builder()
				.idFuncionario(funcionario.getIdFuncionario())
				.build();
	}
}
