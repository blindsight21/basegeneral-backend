package pe.gob.mimp.general.repository.sexo;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;


import pe.gob.mimp.general.model.Sexo;

public interface SexoRepository extends JpaRepository<Sexo, BigDecimal>, CustomSexoRepository{

    
    
}
