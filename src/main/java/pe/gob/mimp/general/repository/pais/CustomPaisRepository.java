/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.pais;

import java.util.List;
import pe.gob.mimp.general.model.Pais;


/**
 *
 * @author Omar
 */
public interface CustomPaisRepository {

    List<Pais> obtenerPaises() throws Exception;
    
    List<Pais> obtenerPorAproximacion(Object field, Object value) throws Exception;
}
