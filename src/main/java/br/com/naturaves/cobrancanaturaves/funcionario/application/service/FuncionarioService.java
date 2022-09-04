package br.com.naturaves.cobrancanaturaves.funcionario.application.service;

import br.com.naturaves.cobrancanaturaves.funcionario.application.api.FuncionarioRequest;
import br.com.naturaves.cobrancanaturaves.funcionario.application.api.FuncionarioResponse;

public interface FuncionarioService {
	FuncionarioResponse criaNovoFuncionario (FuncionarioRequest funcionarioRequest);
}
