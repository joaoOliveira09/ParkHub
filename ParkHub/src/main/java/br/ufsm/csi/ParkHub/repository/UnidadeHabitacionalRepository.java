package br.ufsm.csi.ParkHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.ufsm.csi.ParkHub.model.UnidadeHabitacional;

@Repository
public interface UnidadeHabitacionalRepository extends
JpaRepository<UnidadeHabitacional, Long>{
    
}
