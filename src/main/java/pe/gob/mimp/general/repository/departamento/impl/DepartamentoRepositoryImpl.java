/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.departamento.impl;

import java.math.BigInteger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import pe.gob.mimp.general.model.Departamento;
import pe.gob.mimp.general.repository.departamento.CustomDepartamentoRepository;
import pe.gob.mimp.general.util.Constantes;

/**
 *
 * @author Omar
 */
public class DepartamentoRepositoryImpl implements CustomDepartamentoRepository {

    @PersistenceContext(unitName = Constantes.NOMBRE_ENTITY_MANAGER)
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Departamento> obtenerDepartamentos() throws Exception {
        CriteriaQuery<Departamento> cq = getEntityManager().getCriteriaBuilder().createQuery(Departamento.class);

        Root<Departamento> registro = cq.from(Departamento.class);

        cq.distinct(true);

        //Departamento_.flgActivo
        //Departamento_.txtDescripcion
        cq.where(
                getEntityManager().getCriteriaBuilder().and(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE)
                ));

        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("txtDescripcion")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();
    }

    @Override
    public List<Departamento> obtenerPorAproximacion(Object field, Object value) throws Exception {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery<Departamento> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(Departamento.class);
        EntityType<Departamento> type = getEntityManager().getMetamodel().entity(Departamento.class);
        Root<Departamento> entitie = criteriaQuery.from(Departamento.class);

        //Departamento_.flgActivo
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
    public List<Departamento> obtenerActivos() throws Exception {
        CriteriaQuery<Departamento> cq = getEntityManager().getCriteriaBuilder().createQuery(Departamento.class);
        Root<Departamento> registro = cq.from(Departamento.class);

        //Departamento_.flgActivo
        //Departamento_.cidDepartamento
        cq.distinct(true);
        cq.select(registro)
                .where(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE)
                );

        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("cidDepartamento")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();
    }

    @Override
    public List<Departamento> getDptosByCidDptoIn(List<String> codDep) throws Exception {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery<Departamento> q = criteriaBuilder.createQuery(Departamento.class);
        Root<Departamento> root = q.from(Departamento.class);
        q.select(root);
        //Departamento_.cidDepartamento
        Path<String> parentExpression = root.get("cidDepartamento");
        Predicate parentPredicate = parentExpression.in(codDep);
        q.where(parentPredicate);
        return getEntityManager().createQuery(q).getResultList();
    }

    @Override
    public List<Departamento> findAllByField(Object field, Object value) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery<Departamento> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(Departamento.class);
        Root<Departamento> entitie = criteriaQuery.from(Departamento.class);

        criteriaQuery.select(entitie).where(criteriaBuilder.equal(entitie.get(field.toString()), value));

        return getEntityManager().createQuery(criteriaQuery).getResultList();
    }

}
