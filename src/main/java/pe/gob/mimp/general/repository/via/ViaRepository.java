package pe.gob.mimp.general.repository.via;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.mimp.general.model.Via;

public interface ViaRepository extends JpaRepository<Via, BigDecimal>, CustomViaRepository{

}
