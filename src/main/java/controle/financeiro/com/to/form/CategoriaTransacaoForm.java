package controle.financeiro.com.to.form;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaTransacaoForm {
    private Long id;

    @NonNull
    private Integer tipoTransacao;

    @NonNull
    private String descricao;
}
