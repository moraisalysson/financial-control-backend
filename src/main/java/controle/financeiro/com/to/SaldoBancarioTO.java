package controle.financeiro.com.to;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SaldoBancarioTO {
    private Long id;

    private ContaBancariaTO contaBancaria;

    private BigDecimal valor;

    private LocalDateTime dataCriacao;

    private LocalDateTime dataAtualizacao;
}