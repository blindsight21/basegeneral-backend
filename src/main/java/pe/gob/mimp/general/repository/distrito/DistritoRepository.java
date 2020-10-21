package pe.gob.mimp.general.repository.distrito;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.mimp.general.model.Distrito;



public interface DistritoRepository extends JpaRepository<Distrito, BigDecimal>, CustomDistritoRepository{

}
