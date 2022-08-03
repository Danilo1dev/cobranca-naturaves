package br.com.naturaves.cobrancanaturaves.boleto.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Boleto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idBoleto;

	@NotNull
	@NotBlank(message = "O numero do boleto não pode estar em branco")
	private String numeroBoleto;
	@NotNull
	@Size(max = 2)
	private String numeroDaParcela;
	@NotNull
	private LocalDate dataDoVencimento;
	@NotNull
	private Double valorDoBoleto;
	@NotNull
	private Double valorNegociado;
	private GrupoEmpresarial grupoEmpresarial;
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private LocalDate dataDoContato;
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private LocalDate dataDoRetorno;

	@NotBlank(message = "Por favor insira uma anotação")
	@Lob
	private String descricao;

	private LocalDateTime dataHoraDaCadastro;
	private LocalDateTime dataHoraDoUltimaAlteracao;
	
	
	public Boleto(UUID idBoleto,
			@NotNull @NotBlank(message = "O numero do boleto não pode estar em branco") String numeroBoleto,
			@NotNull @Size(max = 2) String numeroDaParcela, @NotNull LocalDate dataDoVencimento,
			@NotNull Double valorDoBoleto, @NotNull Double valorNegociado, GrupoEmpresarial grupoEmpresarial,
			@NotNull LocalDate dataDoContato, @NotNull LocalDate dataDoRetorno,
			@NotBlank(message = "Por favor insira uma anotação") String descricao) {
		
		this.idBoleto = UUID.randomUUID();
		this.idBoleto = idBoleto;
		this.numeroBoleto = numeroBoleto;
		this.numeroDaParcela = numeroDaParcela;
		this.dataDoVencimento = dataDoVencimento;
		this.valorDoBoleto = valorDoBoleto;
		this.valorNegociado = valorNegociado;
		this.grupoEmpresarial = grupoEmpresarial;
		this.dataDoContato = dataDoContato;
		this.dataDoRetorno = dataDoRetorno;
		this.descricao = descricao;
		this.dataHoraDaCadastro = LocalDateTime.now();
	}
}
