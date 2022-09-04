package br.com.naturaves.cobrancanaturaves.boleto.apllication.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.naturaves.cobrancanaturaves.boleto.domain.Boleto;
import br.com.naturaves.cobrancanaturaves.boleto.domain.GrupoEmpresarial;
import lombok.Value;

@Value
public class BoletoClienteListResponse {
	
	private UUID idBoleto;
	private String numeroBoleto;
	private String numeroDaParcela;
	private LocalDate dataDoVencimento;
	private Double valorDoBoleto;
	private GrupoEmpresarial grupoEmpresarial;
	private LocalDateTime dataHoraDaCadastro;
	
	public static List<BoletoClienteListResponse> converte(List<Boleto> boletoDoCliente) {
		return boletoDoCliente.stream()
				.map(BoletoClienteListResponse::new)
				.collect(Collectors.toList());
	}

	public BoletoClienteListResponse(Boleto boleto) {
		this.idBoleto = boleto.getIdBoleto();
		this.numeroBoleto = boleto.getNumeroBoleto();
		this.numeroDaParcela = boleto.getNumeroDaParcela();
		this.dataDoVencimento = boleto.getDataDoVencimento();
		this.valorDoBoleto = boleto.getValorDoBoleto();
		this.grupoEmpresarial = boleto.getGrupoEmpresarial();
		this.dataHoraDaCadastro = boleto.getDataHoraDaCadastro();
	}
}
