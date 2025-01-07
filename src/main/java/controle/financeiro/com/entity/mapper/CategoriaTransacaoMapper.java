package controle.financeiro.com.entity.mapper;


import controle.financeiro.com.entity.CategoriaTransacao;
import controle.financeiro.com.to.CategoriaTransacaoTO;
import controle.financeiro.com.to.form.CategoriaTransacaoForm;
import org.springframework.stereotype.Component;

@Component
public class CategoriaTransacaoMapper {

    public CategoriaTransacaoTO toTO(CategoriaTransacao categoriaTransacao) {
        var categoriaTransacaoTO = new CategoriaTransacaoTO();

        categoriaTransacaoTO.setId(categoriaTransacao.getId());
        categoriaTransacaoTO.setTipoTransacao(categoriaTransacao.getTipoTransacao());
        categoriaTransacaoTO.setDescricao(categoriaTransacao.getDescricao());

        return categoriaTransacaoTO;
    }

    public CategoriaTransacao toEntityCreate(CategoriaTransacaoForm form) {
        var categoriaTransacao = new CategoriaTransacao();

        categoriaTransacao.setId(form.getId());
        categoriaTransacao.setTipoTransacao(form.getTipoTransacao());
        categoriaTransacao.setDescricao(form.getDescricao());

        return categoriaTransacao;
    }

    public CategoriaTransacao toEntityUpdate() {

        return null;
    }
}
