package pe.gob.mimp.general.repository.departamentocoordenadas;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;


import pe.gob.mimp.general.model.DepartamentoCoordenadas;

public interface DepartCoordRepository extends JpaRepository<DepartamentoCoordenadas, BigDecimal>, CustomDepartCoordRepository{
    
}
