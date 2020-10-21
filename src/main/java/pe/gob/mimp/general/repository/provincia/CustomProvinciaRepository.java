/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.provincia;

import java.util.List;
import pe.gob.mimp.general.model.Departamento;
import pe.gob.mimp.general.model.Provincia;

/**
 *
 * @author Omar
 */
public interface CustomProvinciaRepository {

    List<Provincia> obtenerProvincias(Departamento departamento) throws Exception;

    List<Provincia> obtenerProvinciasPorNombre(Departamento departamento, String provincia) throws Exception;

    List<Provincia> obtenerPorAproximacion(Object field, Object value) throws Exception;

    List<Provincia> obtenerPorAproximacion(Departamento departamento, Object field, Object value) throws Exception;

    List<Provincia> obtenerActivos() throws Exception;

    List<Provincia> findAllByField(Object field, Object value);
}
