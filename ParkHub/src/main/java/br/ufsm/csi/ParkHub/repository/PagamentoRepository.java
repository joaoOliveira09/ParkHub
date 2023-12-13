package br.ufsm.csi.ParkHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.ufsm.csi.ParkHub.model.Pagamento;

@Repository
public interface PagamentoRepository extends
JpaRepository<Pagamento, Long>{
    
}
