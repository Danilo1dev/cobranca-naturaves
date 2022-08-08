package br.com.naturaves.cobrancanaturaves.funcionario.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.naturaves.cobrancanaturaves.funcionario.application.api.FuncionarioCriadoResponse;
import br.com.naturaves.cobrancanaturaves.funcionario.application.api.FuncionarioNovoRequest;
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
	public FuncionarioCriadoResponse criaNovoFuncionario(@Valid FuncionarioNovoRequest funcionarioNovoRequest) {
		log.info("[inicia] FuncionarioApplicationService - criaNovoFuncionario");
		Funcionario funcionario  = funcionarioRepository.salva(new Funcionario(funcionarioNovoRequest));
		log.info("[finaliza] FuncionarioApplicationService - criaNovoFuncionario");
		return FuncionarioCriadoResponse.builder()
				.idFuncionario(funcionario.getIdFuncionario())
				.build();
	}
}
