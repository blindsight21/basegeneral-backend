/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.departamentocoordenadas;

import java.util.List;
import pe.gob.mimp.general.model.Departamento;
import pe.gob.mimp.general.model.DepartamentoCoordenadas;

/**
 *
 * @author Omar
 */
public interface CustomDepartCoordRepository {

    List<DepartamentoCoordenadas> obtenerCoordenadas(Departamento departamento) throws Exception;

    List<DepartamentoCoordenadas> obtenerCoordenadas() throws Exception;
    
    List<DepartamentoCoordenadas> obtenerCoordenadas(String nombreDepartamento) throws Exception;
}
