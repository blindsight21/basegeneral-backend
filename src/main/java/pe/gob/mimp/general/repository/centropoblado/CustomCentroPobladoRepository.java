/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.centropoblado;

import java.util.List;
import pe.gob.mimp.general.model.CentroPoblado;
import pe.gob.mimp.general.model.Distrito;

/**
 *
 * @author Omar
 */
public interface CustomCentroPobladoRepository {

    List<CentroPoblado> obtenerActivos(Distrito distrito) throws Exception;

    List<CentroPoblado> obtenerPorAproximacion(Object field, Object value) throws Exception;
}
