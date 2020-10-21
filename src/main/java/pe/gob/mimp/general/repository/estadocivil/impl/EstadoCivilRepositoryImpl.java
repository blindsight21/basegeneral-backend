/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.estadocivil.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pe.gob.mimp.general.repository.estadocivil.CustomEstadoCivilRepository;
import pe.gob.mimp.general.util.Constantes;

/**
 *
 * @author Omar
 */
public class EstadoCivilRepositoryImpl implements CustomEstadoCivilRepository {

    @PersistenceContext(unitName = Constantes.NOMBRE_ENTITY_MANAGER)
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }
    
    
}
