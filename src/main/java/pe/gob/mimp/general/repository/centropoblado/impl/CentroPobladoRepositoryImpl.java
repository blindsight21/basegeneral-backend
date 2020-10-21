/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.centropoblado.impl;

import java.math.BigInteger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import pe.gob.mimp.general.model.CentroPoblado;
import pe.gob.mimp.general.model.Distrito;
import pe.gob.mimp.general.repository.centropoblado.CustomCentroPobladoRepository;
import pe.gob.mimp.general.util.Constantes;

/**
 *
 * @author Omar
 */
public class CentroPobladoRepositoryImpl implements CustomCentroPobladoRepository {

    @PersistenceContext(unitName = Constantes.NOMBRE_ENTITY_MANAGER)
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<CentroPoblado> obtenerActivos(Distrito distrito) throws Exception {
        CriteriaQuery<CentroPoblado> cq = getEntityManager().getCriteriaBuilder().createQuery(CentroPoblado.class);
        Root<CentroPoblado> registro = cq.from(CentroPoblado.class);

        cq.distinct(true);
        //CentroPoblado_.flgActivo
        //CentroPoblado_.distrito
        //CentroPoblado_.txtCentroPoblado
        cq.where(
                getEntityManager().getCriteriaBuilder().and(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE),
                        getEntityManager().getCriteriaBuilder().equal(registro.get("distrito"), distrito)
                ));

        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("txtCentroPoblado")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();
    }

    @Override
    public List<CentroPoblado> obtenerPorAproximacion(Object field, Object value) throws Exception {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery<CentroPoblado> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(CentroPoblado.class);
        EntityType<CentroPoblado> type = getEntityManager().getMetamodel().entity(CentroPoblado.class);
        Root<CentroPoblado> entitie = criteriaQuery.from(CentroPoblado.class);

        //CentroPoblado_.flgActivo
        criteriaQuery.select(entitie).where(
                criteriaBuilder.or(
                        criteriaBuilder.like(entitie.get(type.getDeclaredSingularAttribute(field.toString(), String.class)), "%" + value + "%")
                ),
                criteriaBuilder.and(
                        criteriaBuilder.equal(entitie.get("flgActivo"), BigInteger.ONE)
                )
        );

        return getEntityManager().createQuery(criteriaQuery).getResultList();

    }

}
