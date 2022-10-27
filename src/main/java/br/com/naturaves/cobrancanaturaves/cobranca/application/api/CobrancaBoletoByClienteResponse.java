package br.com.naturaves.cobrancanaturaves.cobranca.application.api;

import java.math.BigDecimal;
import java.time.LocalDate;
import br.com.naturaves.cobrancanaturaves.boleto.domain.Boleto;
import br.com.naturaves.cobrancanaturaves.cliente.domain.Cliente;
import br.com.naturaves.cobrancanaturaves.cobranca.domain.Cobranca;
import lombok.Value;

@Value
public class CobrancaBoletoByClienteResponse {
    private String cliente;
    private String nomeCliente;
    private String telefone;
    private String documento;
    private String parcela;
    private LocalDate dataVencimento;
    private BigDecimal saldoDevedor;
    private LocalDate dataDeRetorno;
    private Double valorNegociado;
    private String anotacao;

    public CobrancaBoletoByClienteResponse(Cliente cliente, Boleto boleto, Cobranca cobranca) {
        this.cliente = cliente.getCliente();
        this.nomeCliente = cliente.getNomeCliente();
        this.telefone = cliente.getTelefone();
        this.documento = boleto.getDocumento();
        this.parcela = boleto.getParcela();
        this.dataVencimento = boleto.getDataVencimento();
        this.saldoDevedor = boleto.getSaldoDevedor();
        this.dataDeRetorno = cobranca.getDataDeRetorno();
        this.valorNegociado = cobranca.getValorNegociado();
        this.anotacao = cobranca.getAnotacao();
    }
}
