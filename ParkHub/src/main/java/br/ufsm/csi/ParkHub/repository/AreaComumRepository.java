package br.ufsm.csi.ParkHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.ufsm.csi.ParkHub.model.AreaComum;

@Repository
public interface AreaComumRepository extends
JpaRepository<AreaComum, Long>{
    
}
