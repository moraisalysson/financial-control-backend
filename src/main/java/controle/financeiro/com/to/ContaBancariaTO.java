package controle.financeiro.com.to;

import controle.financeiro.com.entity.SaldoBancario;
import controle.financeiro.com.entity.TransacoesBancarias;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ContaBancariaTO {
    private Long id;

    private String nomeBanco;

    private Integer numeroConta;

    private Integer agencia;

    private Integer tipo;

    private LocalDateTime dataCriacao;

    private LocalDateTime dataAtualizacao;

    private List<TransacoesBancarias> transacoesBancarias;

    private List<SaldoBancario> saldosBancarios;
}