/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.distritocoordenadas;

import java.util.List;
import pe.gob.mimp.general.model.Distrito;
import pe.gob.mimp.general.model.DistritoCoordenadas;


/**
 *
 * @author Omar
 */
public interface CustomDistritoCoordRepository {

    List<DistritoCoordenadas> obtenerCoordenadas(Distrito distrito) throws Exception;
}
