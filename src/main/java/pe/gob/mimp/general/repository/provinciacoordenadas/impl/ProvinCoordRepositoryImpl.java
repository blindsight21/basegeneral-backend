/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.provinciacoordenadas.impl;

import java.math.BigInteger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import pe.gob.mimp.general.model.Provincia;
import pe.gob.mimp.general.model.ProvinciaCoordenadas;
import pe.gob.mimp.general.repository.provinciacoordenadas.CustomProvinCoordRepository;
import pe.gob.mimp.general.util.Constantes;

/**
 *
 * @author Omar
 */
public class ProvinCoordRepositoryImpl implements CustomProvinCoordRepository {

    @PersistenceContext(unitName = Constantes.NOMBRE_ENTITY_MANAGER)
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<ProvinciaCoordenadas> obtenerCoordenadas(Provincia provincia) throws Exception
    {
        CriteriaQuery<ProvinciaCoordenadas> cq = getEntityManager().getCriteriaBuilder().createQuery(ProvinciaCoordenadas.class);
        Root<ProvinciaCoordenadas> registro = cq.from(ProvinciaCoordenadas.class);

        cq.distinct(true);
        
        //ProvinciaCoordenadas_.flgActivo
        //ProvinciaCoordenadas_.provincia
        //ProvinciaCoordenadas_.nidProvinciaCoordenadas
        cq.where(
                getEntityManager().getCriteriaBuilder().and(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE), 
                        getEntityManager().getCriteriaBuilder().equal(registro.get("provincia"), provincia)
                ));

        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("nidProvinciaCoordenadas")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();
    }
}
