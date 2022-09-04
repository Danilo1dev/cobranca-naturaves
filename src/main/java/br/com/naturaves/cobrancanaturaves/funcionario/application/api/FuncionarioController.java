package br.com.naturaves.cobrancanaturaves.funcionario.application.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.naturaves.cobrancanaturaves.funcionario.application.service.FuncionarioApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {
	private final FuncionarioApplicationService funcionarioApplicationService;

	@Override
	public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
		log.info("[inicia] FuncionarioController - postFuncionario");
		FuncionarioResponse funcionarioCriado = funcionarioApplicationService.criaNovoFuncionario(funcionarioRequest);
		log.info("[finaliza] FuncionarioController - postFuncionario");
		return funcionarioCriado;
	}
}
