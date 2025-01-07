package controle.financeiro.com.service;

import controle.financeiro.com.entity.CategoriaTransacao;
import controle.financeiro.com.entity.ContaBancaria;
import controle.financeiro.com.entity.mapper.CategoriaTransacaoMapper;
import controle.financeiro.com.entity.mapper.ContaBancariaMapper;
import controle.financeiro.com.repository.CategoriaTransacaoRepository;
import controle.financeiro.com.repository.ContaBancariaRepository;
import controle.financeiro.com.to.CategoriaTransacaoTO;
import controle.financeiro.com.to.ContaBancariaTO;
import controle.financeiro.com.to.form.CategoriaTransacaoForm;
import controle.financeiro.com.to.form.ContaBancariaForm;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaTransacaoService {

    private final CategoriaTransacaoRepository repository;
    private final CategoriaTransacaoMapper mapper;

    public CategoriaTransacaoService(CategoriaTransacaoRepository repository, CategoriaTransacaoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public CategoriaTransacaoTO create(CategoriaTransacaoForm form) {
        CategoriaTransacao entity = mapper.toEntityCreate(form);

        try {
            repository.save(entity);
            return mapper.toTO(entity);
        } catch (DataAccessException e) {
            throw new DataIntegrityViolationException("Não foi possível salvar a Categoria da Transação.");
        }
    }

    public List<CategoriaTransacaoTO> list() {
        var listEntity = getListEntity().stream().map(
                mapper::toTO
        );

        return listEntity.toList();
    }

    private List<CategoriaTransacao> getListEntity() {
        return repository.findAll();
    }
}
