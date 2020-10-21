package pe.gob.mimp.general.repository.mes;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;


import pe.gob.mimp.general.model.Mes;

public interface MesRepository extends JpaRepository<Mes, BigDecimal>, CustomMesRepository{
    
}
