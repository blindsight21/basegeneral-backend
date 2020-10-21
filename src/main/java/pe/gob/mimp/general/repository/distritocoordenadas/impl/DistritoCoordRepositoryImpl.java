/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.distritocoordenadas.impl;

import java.math.BigInteger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import pe.gob.mimp.general.model.Distrito;
import pe.gob.mimp.general.model.DistritoCoordenadas;
import pe.gob.mimp.general.repository.distritocoordenadas.CustomDistritoCoordRepository;
import pe.gob.mimp.general.util.Constantes;

/**
 *
 * @author Omar
 */
public class DistritoCoordRepositoryImpl implements CustomDistritoCoordRepository {

    @PersistenceContext(unitName = Constantes.NOMBRE_ENTITY_MANAGER)
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<DistritoCoordenadas> obtenerCoordenadas(Distrito distrito) throws Exception {
        CriteriaQuery<DistritoCoordenadas> cq = getEntityManager().getCriteriaBuilder().createQuery(DistritoCoordenadas.class);
        Root<DistritoCoordenadas> registro = cq.from(DistritoCoordenadas.class);

        cq.distinct(true);

        //DistritoCoordenadas_.flgActivo
        //DistritoCoordenadas_.distrito
        //DistritoCoordenadas_.nidDistritoCoordenadas
        cq.where(
                getEntityManager().getCriteriaBuilder().and(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE), 
                        getEntityManager().getCriteriaBuilder().equal(registro.get("distrito"), distrito)
                ));

        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("nidDistritoCoordenadas")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();
    }
}
