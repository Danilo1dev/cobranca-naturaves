package br.com.naturaves.cobrancanaturaves.funcionario.application.api;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import br.com.naturaves.cobrancanaturaves.funcionario.application.service.FuncionarioApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
@Validated
public class FuncionarioController implements FuncionarioAPI {
	private final FuncionarioApplicationService funcionarioApplicationService;

	@Override
	public FuncionarioCriadoResponse postFuncionario(@Valid FuncionarioNovoRequest funcionarioNovoRequest) {
		log.info("[inicia] FuncionarioController - postFuncionario");
		FuncionarioCriadoResponse funcionarioCriado = funcionarioApplicationService.criaNovoFuncionario(funcionarioNovoRequest);
		log.info("[finaliza] FuncionarioController - postFuncionario");
		return funcionarioCriado;
	}
}
