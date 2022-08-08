package br.com.naturaves.cobrancanaturaves.funcionario.application.service;

import javax.validation.Valid;

import br.com.naturaves.cobrancanaturaves.funcionario.application.api.FuncionarioCriadoResponse;
import br.com.naturaves.cobrancanaturaves.funcionario.application.api.FuncionarioNovoRequest;

@Valid	
public interface FuncionarioService {
	FuncionarioCriadoResponse criaNovoFuncionario (@Valid FuncionarioNovoRequest funcionarioNovoRequest);
}
