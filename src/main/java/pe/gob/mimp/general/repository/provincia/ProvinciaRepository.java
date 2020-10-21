package pe.gob.mimp.general.repository.provincia;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;


import pe.gob.mimp.general.model.Provincia;

public interface ProvinciaRepository extends JpaRepository<Provincia, BigDecimal>, CustomProvinciaRepository{
    
}
