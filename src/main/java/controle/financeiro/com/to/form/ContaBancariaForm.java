package controle.financeiro.com.to.form;

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
public class ContaBancariaForm {
    private Long id;

    @NonNull
    private String nomeBanco;

    @NonNull
    private Integer numeroConta;

    @NonNull
    private Integer agencia;

    @NonNull
    private Integer tipo;
}
