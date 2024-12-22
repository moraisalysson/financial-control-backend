package controle.financeiro.com.entity.enums;

import java.util.stream.Stream;

public enum TiposTrancacoesEnum {
    PAGAMENTO(0),
    RECEBIMENTO(1),
    ESTORNO(2);

    private final Integer chave;

    TiposTrancacoesEnum(Integer chave) {
        this.chave = chave;
    }

    public Integer getChave() {
        return this.chave;
    }

    public static TiposTrancacoesEnum getByChave(Integer chave) {
        return Stream.of(values()).filter(e -> e.getChave().equals(chave)).findFirst().orElse(null);
    }
}
