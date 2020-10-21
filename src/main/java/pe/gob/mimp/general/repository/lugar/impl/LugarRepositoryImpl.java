/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.lugar.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jdk.nashorn.internal.runtime.logging.Logger;
import pe.gob.mimp.general.repository.lugar.CustomLugarRepository;
import pe.gob.mimp.general.util.Constantes;

/**
 *
 * @author Omar
 */
@Logger
public class LugarRepositoryImpl implements CustomLugarRepository {

    @PersistenceContext(unitName = Constantes.NOMBRE_ENTITY_MANAGER)
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }
    
}
