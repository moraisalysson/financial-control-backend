package controle.financeiro.com.repository;

import controle.financeiro.com.entity.CategoriaTransacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaTransacaoRepository extends JpaRepository<CategoriaTransacao, Long> {
}
