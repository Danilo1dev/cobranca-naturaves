package br.com.naturaves.cobrancanaturaves.funcionario.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.naturaves.cobrancanaturaves.funcionario.domain.Funcionario;
import lombok.Value;

@Value
public class FuncionarioListResponse {
	private UUID idFuncionario;
	private String nome;
	private String cargo;

	public static List<FuncionarioListResponse> converte(List<Funcionario> funcionario) {
		return funcionario.stream()
				.map(FuncionarioListResponse::new)
				.collect(Collectors.toList());
	}
	
	public FuncionarioListResponse(Funcionario funcionario) {
		this.idFuncionario = funcionario.getIdFuncionario();
		this.nome = funcionario.getNome();
		this.cargo = funcionario.getCargo();
	}
}
