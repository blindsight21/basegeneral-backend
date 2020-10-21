package pe.gob.mimp.general.repository.estadocivil;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;


import pe.gob.mimp.general.model.EstadoCivil;

public interface EstadoCivilRepository extends JpaRepository<EstadoCivil, BigDecimal>, CustomEstadoCivilRepository{

}
