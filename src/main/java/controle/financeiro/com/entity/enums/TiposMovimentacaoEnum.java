package controle.financeiro.com.entity.enums;

import java.util.stream.Stream;

public enum TiposMovimentacaoEnum {
    PAGAMENTO(0),
    RECEBIMENTO(1),
    ESTORNO(2);

    private final Integer chave;

    TiposMovimentacaoEnum(Integer chave) {
        this.chave = chave;
    }

    public Integer getChave() {
        return this.chave;
    }

    public static TiposMovimentacaoEnum getByChave(Integer chave) {
        return Stream.of(values()).filter(e -> e.getChave().equals(chave)).findFirst().orElse(null);
    }
}
