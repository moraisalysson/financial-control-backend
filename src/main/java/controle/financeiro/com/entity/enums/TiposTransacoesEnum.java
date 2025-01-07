package controle.financeiro.com.entity.enums;

import java.util.stream.Stream;

public enum TiposTransacoesEnum {
    DESPESA(0),
    RECEITA(1),
    TRANSFERENCIA(2);

    private final Integer chave;

    TiposTransacoesEnum(Integer chave) {
        this.chave = chave;
    }

    public Integer getChave() {
        return this.chave;
    }

    public static TiposTransacoesEnum getByChave(Integer chave) {
        return Stream.of(values()).filter(e -> e.getChave().equals(chave)).findFirst().orElse(null);
    }
}
