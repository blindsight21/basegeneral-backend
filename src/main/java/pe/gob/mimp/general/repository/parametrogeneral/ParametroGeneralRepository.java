package pe.gob.mimp.general.repository.parametrogeneral;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;


import pe.gob.mimp.general.model.ParametroGeneral;

public interface ParametroGeneralRepository extends JpaRepository<ParametroGeneral, BigDecimal>, CustomParametroGeneralRepository{

    
    
}
