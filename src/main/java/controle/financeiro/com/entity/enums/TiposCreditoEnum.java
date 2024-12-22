package controle.financeiro.com.entity.enums;

import java.util.stream.Stream;

public enum TiposCreditoEnum {
    A_PAGAR(0),
    A_RECEBER(1);

    private final Integer chave;

    TiposCreditoEnum(Integer chave) {
        this.chave = chave;
    }

    public Integer getChave() {
        return this.chave;
    }

    public static TiposCreditoEnum getByChave(Integer chave) {
        return Stream.of(values()).filter(e -> e.getChave().equals(chave)).findFirst().orElse(null);
    }
}
