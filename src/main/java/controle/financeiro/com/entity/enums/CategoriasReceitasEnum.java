package controle.financeiro.com.entity.enums;

import java.util.stream.Stream;

public enum CategoriasReceitasEnum {
    SALARIO(0, ""),
    OUTRAS_RECEITAS(1, ""),
    INVESTIMENTOS(2, "");

    private final Integer chave;
    private final String descricao;

    CategoriasReceitasEnum(Integer chave, String descricao) {
        this.chave = chave;
        this.descricao = descricao;
    }

    public Integer getChave() {
        return this.chave;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static CategoriasReceitasEnum getByChave(Integer chave) {
        return Stream.of(values()).filter(e -> e.getChave().equals(chave)).findFirst().orElse(null);
    }
}
