package controle.financeiro.com.to;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TransacoesBancariasTO {
    private Long id;

    private ContaBancariaTO contaBancaria;

    private Integer tipo;

    private Integer categoria;

    private BigDecimal valor;

    private Integer aCredito;

    private String descricao;

    private LocalDateTime dataCriacao;

    private LocalDateTime dataAtualizacao;
}
