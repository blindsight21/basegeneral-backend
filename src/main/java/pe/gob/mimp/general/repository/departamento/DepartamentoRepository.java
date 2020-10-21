package pe.gob.mimp.general.repository.departamento;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;


import pe.gob.mimp.general.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, BigDecimal>, CustomDepartamentoRepository{
    
}
