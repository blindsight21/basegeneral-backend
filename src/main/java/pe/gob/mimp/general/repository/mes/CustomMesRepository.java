/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.mes;

import java.util.List;
import java.util.Map;
import pe.gob.mimp.general.model.Mes;


/**
 *
 * @author Omar
 */
public interface CustomMesRepository {
    
    List<Mes> findByParams(Map<String, Object> parameters, String orderBy) throws Exception;
    
    int getRecordCount(Map<String, Object> parameters) throws Exception;
}
