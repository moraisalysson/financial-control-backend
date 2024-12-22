package controle.financeiro.com.entity.enums;

import java.util.stream.Stream;

public enum CategoriasDespesasEnum {
    CASA(0, ""),
    TRANSPORTE(1, "");

    private final Integer chave;
    private final String descricao;

    CategoriasDespesasEnum(Integer chave, String descricao) {
        this.chave = chave;
        this.descricao = descricao;
    }

    public Integer getChave() {
        return this.chave;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static CategoriasDespesasEnum getByChave(Integer chave) {
        return Stream.of(values()).filter(e -> e.getChave().equals(chave)).findFirst().orElse(null);
    }
}
