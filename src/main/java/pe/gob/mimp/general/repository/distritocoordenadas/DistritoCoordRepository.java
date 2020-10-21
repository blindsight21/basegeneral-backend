package pe.gob.mimp.general.repository.distritocoordenadas;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.mimp.general.model.DistritoCoordenadas;



public interface DistritoCoordRepository extends JpaRepository<DistritoCoordenadas, BigDecimal>, CustomDistritoCoordRepository{

}
