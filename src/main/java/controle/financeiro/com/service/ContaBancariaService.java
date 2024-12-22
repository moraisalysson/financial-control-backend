package controle.financeiro.com.service;

import controle.financeiro.com.entity.ContaBancaria;
import controle.financeiro.com.entity.mapper.ContaBancariaMapper;
import controle.financeiro.com.repository.ContaBancariaRepository;
import controle.financeiro.com.to.ContaBancariaTO;
import controle.financeiro.com.to.form.ContaBancariaForm;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContaBancariaService {

    private final ContaBancariaRepository contaBancariaRepository;
    private final ContaBancariaMapper contaBancariaMapper;

    public ContaBancariaService(ContaBancariaRepository contaBancariaRepository, ContaBancariaMapper contaBancariaMapper) {
        this.contaBancariaMapper = contaBancariaMapper;
        this.contaBancariaRepository = contaBancariaRepository;
    }

    public ContaBancariaTO create(ContaBancariaForm form) {
        ContaBancaria entity = contaBancariaMapper.toEntityCreate(form);

        try {
            contaBancariaRepository.save(entity);
            return contaBancariaMapper.toTO(entity);
        } catch (DataAccessException e) {
            throw new DataIntegrityViolationException("Não foi possível salvar a Conta Bancária.");
        }
    }

    public List<ContaBancariaTO> list() {
        var listEntity = getListEntity().stream().map(
                contaBancariaMapper::toTO
        );

        return listEntity.toList();
    }

    private List<ContaBancaria> getListEntity() {
        return contaBancariaRepository.findAll();
    }
}
