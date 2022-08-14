package br.com.naturaves.cobrancanaturaves.boleto.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Boleto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idBoleto", updatable = false, unique = true, nullable = false)
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
	@Enumerated(EnumType.STRING)
	private GrupoEmpresarial grupoEmpresarial;
	@NotNull
	private LocalDate dataDoContato;
	@NotNull
	private LocalDate dataDoRetorno;

	@NotBlank(message = "Por favor insira uma anotação")
	@Lob
	private String anotacao;

	private LocalDateTime dataHoraDaCadastro;
	private LocalDateTime dataHoraDoUltimaAlteracao;
}
