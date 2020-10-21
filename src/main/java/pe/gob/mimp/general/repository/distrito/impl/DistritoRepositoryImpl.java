/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.distrito.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import pe.gob.mimp.general.model.Departamento;
import pe.gob.mimp.general.model.Distrito;
import pe.gob.mimp.general.model.Provincia;
import pe.gob.mimp.general.repository.distrito.CustomDistritoRepository;
import pe.gob.mimp.general.util.Constantes;

/**
 *
 * @author Omar
 */
public class DistritoRepositoryImpl implements CustomDistritoRepository {

    @PersistenceContext(unitName = Constantes.NOMBRE_ENTITY_MANAGER)
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Distrito> obtenerDistritos(Provincia provincia) {
        CriteriaQuery<Distrito> cq = getEntityManager().getCriteriaBuilder().createQuery(Distrito.class);
        Root<Distrito> registro = cq.from(Distrito.class);

        cq.distinct(true);

        //Distrito_.provincia
        //Distrito_.flgActivo
        cq.where(
                getEntityManager().getCriteriaBuilder().and(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE), getEntityManager().getCriteriaBuilder().equal(registro.get("provincia"), provincia)
                ));

        //Distrito_.txtDescripcion
        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("txtDescripcion")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();

    }

    @Override
    public List<Distrito> obtenerDistritosPorNombre(Provincia provincia, String distrito) {
        CriteriaQuery<Distrito> cq = getEntityManager().getCriteriaBuilder().createQuery(Distrito.class);
        Root<Distrito> registro = cq.from(Distrito.class);

        cq.distinct(true);

        //Distrito_.txtDescripcion
        //Distrito_.provincia
        //Distrito_.flgActivo
        cq.where(
                getEntityManager().getCriteriaBuilder().and(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE), getEntityManager().getCriteriaBuilder().equal(registro.get("provincia"), provincia), getEntityManager().getCriteriaBuilder().equal(registro.get("txtDescripcion"), distrito)
                ));

        //Distrito_.txtDescripcion
        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("txtDescripcion")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();

    }

    @Override
    public List<Distrito> obtenerPorAproximacion(Object field, Object value) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery<Distrito> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(Distrito.class);
        EntityType<Distrito> type = getEntityManager().getMetamodel().entity(Distrito.class);
        Root<Distrito> entitie = criteriaQuery.from(Distrito.class);

        //Distrito_.flgActivo
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
    public List<Distrito> obtenerPorAproximacion(Provincia provincia, Object field, Object value) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery<Distrito> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(Distrito.class);
        EntityType<Distrito> type = getEntityManager().getMetamodel().entity(Distrito.class);
        Root<Distrito> entitie = criteriaQuery.from(Distrito.class);

        //Distrito_.flgActivo
        //Distrito_.provincia
        criteriaQuery.select(entitie).where(
                criteriaBuilder.or(
                        criteriaBuilder.like(entitie.get(type.getDeclaredSingularAttribute(field.toString(), String.class)), "%" + value + "%")
                ),
                criteriaBuilder.and(
                        criteriaBuilder.equal(entitie.get("flgActivo"), BigInteger.ONE),
                        criteriaBuilder.equal(entitie.get("provincia"), provincia)
                )
        );

        return getEntityManager().createQuery(criteriaQuery).getResultList();
    }

    @Override
    public List<Distrito> obtenerActivos() {
        CriteriaQuery<Distrito> cq = getEntityManager().getCriteriaBuilder().createQuery(Distrito.class);
        Root<Distrito> registro = cq.from(Distrito.class);

        //Distrito_.flgActivo
        //Distrito_.cidDistrito
        cq.distinct(true);
        cq.select(registro)
                .where(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE)
                );

        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("cidDistrito")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();
    }

    @Override
    public Distrito obtenerDistrito(String departamento, String provincia, String distrito) {
        Distrito distritoEncontrado = null;
        CriteriaQuery<Distrito> cq = getEntityManager().getCriteriaBuilder().createQuery(Distrito.class);
        Root<Distrito> registro = cq.from(Distrito.class);

        //Distrito_.provincia
        //Provincia_.departamento
        Join<Distrito, Provincia> joinProvincia = registro.join("provincia");
        Join<Provincia, Departamento> joinDepartamento = joinProvincia.join("departamento");

        //Distrito_.flgActivo
        //Distrito_.txtDescripcion
        //Provincia_.txtDescripcion
        //Departamento_.txtDescripcion
        cq.distinct(true);
        cq.select(registro)
                .where(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE), getEntityManager().getCriteriaBuilder().equal(registro.get("txtDescripcion"), distrito), getEntityManager().getCriteriaBuilder().equal(joinProvincia.get("txtDescripcion"), provincia), getEntityManager().getCriteriaBuilder().equal(joinDepartamento.get("txtDescripcion"), departamento)
                );
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        List<Distrito> distritosEncontrados = q.getResultList();
        if (null != distritosEncontrados && 0 < distritosEncontrados.size()) {
            distritoEncontrado = distritosEncontrados.get(0);
        }

        return distritoEncontrado;
    }

    @Override
    public List<Distrito> getDistritosByIdIn(List<BigInteger> ubigeoOrganizacionAndActividad) {
        System.out.println("ubigeoOrganizacionAndActividad:" + ubigeoOrganizacionAndActividad.size());
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery<Distrito> q = criteriaBuilder.createQuery(Distrito.class);
        Root<Distrito> root = q.from(Distrito.class);
        q.select(root);
        //Distrito_.nidDistrito
        Path<BigDecimal> parentExpression = root.get("nidDistrito");
        Predicate parentPredicate = parentExpression.in(ubigeoOrganizacionAndActividad);
        q.where(parentPredicate);
        return getEntityManager().createQuery(q).getResultList();
    }

    @Override
    public List<Distrito> findAllByField(Object field, Object value) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery<Distrito> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(Distrito.class);
        Root<Distrito> entitie = criteriaQuery.from(Distrito.class);

        criteriaQuery.select(entitie).where(criteriaBuilder.equal(entitie.get(field.toString()), value));

        return getEntityManager().createQuery(criteriaQuery).getResultList();
    }
}
