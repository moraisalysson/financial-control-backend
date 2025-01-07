package controle.financeiro.com.to;

import controle.financeiro.com.entity.SaldoBancario;
import controle.financeiro.com.entity.TransacoesBancarias;
import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaTransacaoTO {
    private Long id;

    private Integer tipoTransacao;

    private String descricao;
}