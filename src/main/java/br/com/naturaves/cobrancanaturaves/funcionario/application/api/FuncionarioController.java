package br.com.naturaves.cobrancanaturaves.funcionario.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {

	@Override
	public FuncionarioCriadoResponse postFuncionario(@Valid FuncionarioNovoRequest funcionarioNovoRequest) {
		log.info("[inicia] FuncionarioController - postFuncionario");
		log.info("[finaliza] FuncionarioController - postFuncionario");
		return null;
	}
}
