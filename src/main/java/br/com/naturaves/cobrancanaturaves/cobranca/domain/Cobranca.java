package br.com.naturaves.cobrancanaturaves.cobranca.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import br.com.naturaves.cobrancanaturaves.cobranca.apllication.api.CobrancaRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cobranca {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(columnDefinition = "uuid", name = "idCobranca", updatable = false, unique = true, nullable = false)
		private UUID idCobranca;
		@NotNull
		@Column(columnDefinition = "uuid", name = "idBoleto", nullable = false)
		private UUID idBoleto;
		@NotNull
		@NotBlank(message = "Insira o valor negociado")
		private Double valorNegociado;
		@NotNull
		@NotBlank(message = "Insira uma descrição")
		@Lob
		@Size(max = 200)
		private String anotacao;
		
		private LocalDate dataDeRetorno;
		private LocalDateTime dataDaCobranca;
		
		public Cobranca(UUID idBoleto, @Valid CobrancaRequest cobrancaRequest) {
			this.idBoleto = idBoleto;
			this.valorNegociado = cobrancaRequest.getValorNegociado();
			this.anotacao = cobrancaRequest.getAnotacao();
			this.dataDeRetorno = cobrancaRequest.getDataDeRetorno();
			this.dataDaCobranca = LocalDateTime.now();
		}
}