/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.provinciacoordenadas;

import java.util.List;
import pe.gob.mimp.general.model.Provincia;
import pe.gob.mimp.general.model.ProvinciaCoordenadas;

/**
 *
 * @author Omar
 */
public interface CustomProvinCoordRepository {

    List<ProvinciaCoordenadas> obtenerCoordenadas(Provincia provincia) throws Exception;
}
