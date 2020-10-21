package pe.gob.mimp.general.repository.pais;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;


import pe.gob.mimp.general.model.Pais;

public interface PaisRepository extends JpaRepository<Pais, BigDecimal>, CustomPaisRepository{

    
    
}
