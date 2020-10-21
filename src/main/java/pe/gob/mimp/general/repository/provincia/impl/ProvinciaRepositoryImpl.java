/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.provincia.impl;

import java.math.BigInteger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import pe.gob.mimp.general.model.Departamento;
import pe.gob.mimp.general.model.Provincia;
import pe.gob.mimp.general.repository.provincia.CustomProvinciaRepository;
import pe.gob.mimp.general.util.Constantes;

/**
 *
 * @author Omar
 */
public class ProvinciaRepositoryImpl implements CustomProvinciaRepository {

    @PersistenceContext(unitName = Constantes.NOMBRE_ENTITY_MANAGER)
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Provincia> obtenerProvincias(Departamento departamento) {
        CriteriaQuery<Provincia> cq = getEntityManager().getCriteriaBuilder().createQuery(Provincia.class);
        Root<Provincia> registro = cq.from(Provincia.class);

        cq.distinct(true);

        //Provincia_.flgActivo
        //Provincia_.departamento
        //Provincia_.txtDescripcion
        cq.where(
                getEntityManager().getCriteriaBuilder().and(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE),
                        getEntityManager().getCriteriaBuilder().equal(registro.get("departamento"), departamento)
                ));

        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("txtDescripcion")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();
    }

    @Override
    public List<Provincia> obtenerProvinciasPorNombre(Departamento departamento, String provincia) {
        CriteriaQuery<Provincia> cq = getEntityManager().getCriteriaBuilder().createQuery(Provincia.class);
        Root<Provincia> registro = cq.from(Provincia.class);

        cq.distinct(true);
        //Provincia_.flgActivo
        //Provincia_.txtDescripcion
        //Provincia_.txtDescripcion
        //Provincia_.departamento
        cq.where(
                getEntityManager().getCriteriaBuilder().and(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE), getEntityManager().getCriteriaBuilder().equal(registro.get("departamento"), departamento), getEntityManager().getCriteriaBuilder().equal(registro.get("txtDescripcion"), provincia)
                ));

        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("txtDescripcion")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();
    }

    @Override
    public List<Provincia> obtenerPorAproximacion(Object field, Object value) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery<Provincia> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(Provincia.class);
        EntityType<Provincia> type = getEntityManager().getMetamodel().entity(Provincia.class);
        Root<Provincia> entitie = criteriaQuery.from(Provincia.class);

        //Provincia_.flgActivo
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

    @Override
    public List<Provincia> obtenerPorAproximacion(Departamento departamento, Object field, Object value) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery<Provincia> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(Provincia.class);
        EntityType<Provincia> type = getEntityManager().getMetamodel().entity(Provincia.class);
        Root<Provincia> entitie = criteriaQuery.from(Provincia.class);

        //Provincia_.flgActivo
        //Provincia_.departamento
        criteriaQuery.select(entitie).where(
                criteriaBuilder.or(
                        criteriaBuilder.like(entitie.get(type.getDeclaredSingularAttribute(field.toString(), String.class)), "%" + value + "%")
                ),
                criteriaBuilder.and(
                        criteriaBuilder.equal(entitie.get("flgActivo"), BigInteger.ONE),
                        criteriaBuilder.equal(entitie.get("departamento"), departamento)
                )
        );

        return getEntityManager().createQuery(criteriaQuery).getResultList();
    }

    @Override
    public List<Provincia> obtenerActivos() {
        CriteriaQuery<Provincia> cq = getEntityManager().getCriteriaBuilder().createQuery(Provincia.class);
        Root<Provincia> registro = cq.from(Provincia.class);

        //Provincia_.flgActivo
        //Provincia_.cidProvincia
        cq.distinct(true);
        cq.select(registro)
                .where(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE)
                );

        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("cidProvincia")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();
    }

    @Override
    public List<Provincia> findAllByField(Object field, Object value) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery<Provincia> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(Provincia.class);
        Root<Provincia> entitie = criteriaQuery.from(Provincia.class);

        criteriaQuery.select(entitie).where(criteriaBuilder.equal(entitie.get(field.toString()), value));

        return getEntityManager().createQuery(criteriaQuery).getResultList();
    }

}
