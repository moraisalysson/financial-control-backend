package controle.financeiro.com.entity.mapper;


import controle.financeiro.com.entity.ContaBancaria;
import controle.financeiro.com.to.ContaBancariaTO;
import controle.financeiro.com.to.form.ContaBancariaForm;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ContaBancariaMapper {

    public ContaBancariaTO toTO(ContaBancaria contaBancaria) {
        var contaBancariaTO = new ContaBancariaTO();

        contaBancariaTO.setId(contaBancaria.getId());
        contaBancariaTO.setNomeBanco(contaBancaria.getNomeBanco());
        contaBancariaTO.setNumeroConta(contaBancaria.getNumeroConta());
        contaBancariaTO.setTransacoesBancarias(contaBancaria.getTransacoesBancarias());
        contaBancariaTO.setAgencia(contaBancaria.getAgencia());
        contaBancariaTO.setSaldosBancarios(contaBancaria.getSaldosBancarios());
        contaBancariaTO.setTipo(contaBancaria.getTipo());
        contaBancariaTO.setDataCriacao(contaBancaria.getDataCriacao());
        contaBancariaTO.setDataAtualizacao(contaBancaria.getDataAtualizacao());

        return contaBancariaTO;
    }

    public ContaBancaria toEntityCreate(ContaBancariaForm form) {
        var contaBancaria = new ContaBancaria();

        contaBancaria.setId(form.getId());
        contaBancaria.setNomeBanco(form.getNomeBanco());
        contaBancaria.setNumeroConta(form.getNumeroConta());
        contaBancaria.setAgencia(form.getAgencia());
        contaBancaria.setTipo(form.getTipo());

        return contaBancaria;
    }

    public ContaBancaria toEntityUpdate() {
        return null;
    }
}
