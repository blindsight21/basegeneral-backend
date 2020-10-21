package pe.gob.mimp.general.repository.provinciacoordenadas;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;


import pe.gob.mimp.general.model.ProvinciaCoordenadas;

public interface ProvinCoordRepository extends JpaRepository<ProvinciaCoordenadas, BigDecimal>, CustomProvinCoordRepository{
    
}
