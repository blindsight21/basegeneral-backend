/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.distrito;

import java.math.BigInteger;
import java.util.List;
import pe.gob.mimp.general.model.Distrito;
import pe.gob.mimp.general.model.Provincia;


/**
 *
 * @author Omar
 */
public interface CustomDistritoRepository {

    List<Distrito> obtenerDistritos(Provincia provincia) throws Exception;
    
    List<Distrito> obtenerDistritosPorNombre(Provincia provincia, String distrito) throws Exception;
    
    List<Distrito> obtenerPorAproximacion(Object field, Object value) throws Exception;
    
    List<Distrito> obtenerPorAproximacion(Provincia provincia, Object field, Object value) throws Exception;
    
    List<Distrito> obtenerActivos() throws Exception;
    
    Distrito obtenerDistrito(String departamento, String provincia, String distrito) throws Exception;
    
    List<Distrito> getDistritosByIdIn(List<BigInteger> ubigeoOrganizacionAndActividad) throws Exception;
    
    List<Distrito> findAllByField(Object field, Object value);
}
