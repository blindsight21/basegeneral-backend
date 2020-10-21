package pe.gob.mimp.general.repository.dia;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;


import pe.gob.mimp.general.model.Dia;

public interface DiaRepository extends JpaRepository<Dia, BigDecimal>, CustomDiaRepository{

}
