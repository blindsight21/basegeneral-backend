package pe.gob.mimp.general.repository.institucion;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.gob.mimp.general.model.Institucion;

public interface InstitucionRepository extends JpaRepository<Institucion, BigDecimal>, CustomInstitucionRepository {

}
