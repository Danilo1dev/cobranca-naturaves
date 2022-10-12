package br.com.naturaves.cobrancanaturaves.boleto.application.api;

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
	private String documento;
	private String numeroDaParcela;
	private LocalDate dataVencimento;
	private Double saldoDevedor;
	private GrupoEmpresarial grupoEmpresarial;
	private LocalDateTime dataHoraDaCadastro;
	
	public static List<BoletoClienteListResponse> converte(List<Boleto> boletoDoCliente) {
		return boletoDoCliente.stream()
				.map(BoletoClienteListResponse::new)
				.collect(Collectors.toList());
	}

	public BoletoClienteListResponse(Boleto boleto) {
		this.idBoleto = boleto.getIdBoleto();
		this.documento = boleto.getDocumento();
		this.numeroDaParcela = boleto.getNumeroDaParcela();
		this.dataVencimento = boleto.getDataVencimento();
		this.saldoDevedor = boleto.getSaldoDevedor();
		this.grupoEmpresarial = boleto.getGrupoEmpresarial();
		this.dataHoraDaCadastro = boleto.getDataHoraDaCadastro();
	}
}
