/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.pais.impl;

import java.math.BigInteger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import pe.gob.mimp.general.model.Pais;
import pe.gob.mimp.general.repository.pais.CustomPaisRepository;
import pe.gob.mimp.general.util.Constantes;

/**
 *
 * @author Omar
 */
public class PaisRepositoryImpl implements CustomPaisRepository {

    @PersistenceContext(unitName = Constantes.NOMBRE_ENTITY_MANAGER)
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Pais> obtenerPaises() throws Exception {
        CriteriaQuery<Pais> cq = getEntityManager().getCriteriaBuilder().createQuery(Pais.class);

        Root<Pais> registro = cq.from(Pais.class);

        cq.distinct(true);

        //Pais_.flgActivo
        //Pais_.txtPais
        cq.where(
                getEntityManager().getCriteriaBuilder().and(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE)
                ));

        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("txtPais")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();
    }

    @Override
    public List<Pais> obtenerPorAproximacion(Object field, Object value) throws Exception {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery<Pais> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(Pais.class);
        EntityType<Pais> type = getEntityManager().getMetamodel().entity(Pais.class);
        Root<Pais> entitie = criteriaQuery.from(Pais.class);

        //Pais_.flgActivo
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
