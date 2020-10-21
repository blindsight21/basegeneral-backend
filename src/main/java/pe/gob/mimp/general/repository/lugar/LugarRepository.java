package pe.gob.mimp.general.repository.lugar;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.gob.mimp.general.model.Lugar;

public interface LugarRepository extends JpaRepository<Lugar, BigDecimal>, CustomLugarRepository {

}
