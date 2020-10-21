package pe.gob.mimp.general.repository.centropoblado;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;


import pe.gob.mimp.general.model.CentroPoblado;

public interface CentroPobladoRepository extends JpaRepository<CentroPoblado, BigDecimal>, CustomCentroPobladoRepository{
    
}
