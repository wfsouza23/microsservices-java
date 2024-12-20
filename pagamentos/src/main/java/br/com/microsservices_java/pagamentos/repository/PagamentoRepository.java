package br.com.microsservices_java.pagamentos.repository;

import br.com.microsservices_java.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
