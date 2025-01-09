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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaTransacaoService {

    private final CategoriaTransacaoRepository repository;
    private final CategoriaTransacaoMapper mapper;
    private static final Logger LOGGER = LoggerFactory.getLogger(CategoriaTransacaoService.class);

    public CategoriaTransacaoService(CategoriaTransacaoRepository repository, CategoriaTransacaoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public CategoriaTransacaoTO create(CategoriaTransacaoForm form) {
        LOGGER.info("[CategoriaTransacao - Service] Iniciando a criação de uma Categoria de Transação");
        CategoriaTransacao entity = mapper.toEntityCreate(form);

        try {
            repository.save(entity);
            LOGGER.info("[CategoriaTransacao - Service] Categoria de Transação criada com sucesso. ID: {}", entity.getId());
            return mapper.toTO(entity);
        } catch (DataAccessException e) {
            LOGGER.error("[CategoriaTransacao - Service] Erro ao tentar criar a Categoria de Transação. Erro: {}", e.getMessage());
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
