/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.departamento;

import java.util.List;
import pe.gob.mimp.general.model.Departamento;


/**
 *
 * @author Omar
 */
public interface CustomDepartamentoRepository {
    
    List<Departamento> obtenerDepartamentos() throws Exception;
    
    List<Departamento> obtenerPorAproximacion(Object field, Object value) throws Exception;
    
    List<Departamento> obtenerActivos() throws Exception;
    
    List<Departamento> getDptosByCidDptoIn(List<String> codDep)  throws Exception;
    
    List<Departamento> findAllByField(Object field, Object value);
}
