/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository.departamentocoordenadas.impl;

import java.math.BigInteger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import pe.gob.mimp.general.model.Departamento;
import pe.gob.mimp.general.model.DepartamentoCoordenadas;
import pe.gob.mimp.general.repository.departamentocoordenadas.CustomDepartCoordRepository;
import pe.gob.mimp.general.util.Constantes;

/**
 *
 * @author Omar
 */
public class DepartCoordRepositoryImpl implements CustomDepartCoordRepository {

    @PersistenceContext(unitName = Constantes.NOMBRE_ENTITY_MANAGER)
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<DepartamentoCoordenadas> obtenerCoordenadas(Departamento departamento) throws Exception {
        CriteriaQuery<DepartamentoCoordenadas> cq = getEntityManager().getCriteriaBuilder().createQuery(DepartamentoCoordenadas.class);
        Root<DepartamentoCoordenadas> registro = cq.from(DepartamentoCoordenadas.class);

        cq.distinct(true);

        //DepartamentoCoordenadas_.flgActivo
        //DepartamentoCoordenadas_.departamento
        //DepartamentoCoordenadas_.nidDepartamentoCoordenadas
        cq.where(
                getEntityManager().getCriteriaBuilder().and(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE),
                        getEntityManager().getCriteriaBuilder().equal(registro.get("departamento"), departamento)
                ));

        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("nidDepartamentoCoordenadas")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();
    }

    @Override
    public List<DepartamentoCoordenadas> obtenerCoordenadas() throws Exception {
        CriteriaQuery<DepartamentoCoordenadas> cq = getEntityManager().getCriteriaBuilder().createQuery(DepartamentoCoordenadas.class);
        Root<DepartamentoCoordenadas> registro = cq.from(DepartamentoCoordenadas.class);

        cq.distinct(true);

        //DepartamentoCoordenadas_.flgActivo
        //DepartamentoCoordenadas_.nidDepartamentoCoordenadas
        cq.where(
                getEntityManager().getCriteriaBuilder().and(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE)
                ));

        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("nidDepartamentoCoordenadas")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();
    }

    @Override
    public List<DepartamentoCoordenadas> obtenerCoordenadas(String nombreDepartamento) throws Exception {
        CriteriaQuery<DepartamentoCoordenadas> cq = getEntityManager().getCriteriaBuilder().createQuery(DepartamentoCoordenadas.class);
        Root<DepartamentoCoordenadas> registro = cq.from(DepartamentoCoordenadas.class);

        //DepartamentoCoordenadas_.departamento
        Join<DepartamentoCoordenadas, Departamento> joinDepartamento = registro.join("departamento");

        cq.distinct(true);
        //DepartamentoCoordenadas_.flgActivo
        //Departamento_.txtDescripcion
        //DepartamentoCoordenadas_.nidDepartamentoCoordenadas
        cq.where(
                getEntityManager().getCriteriaBuilder().and(
                        getEntityManager().getCriteriaBuilder().equal(registro.get("flgActivo"), BigInteger.ONE),
                        getEntityManager().getCriteriaBuilder().equal(joinDepartamento.get("txtDescripcion"), nombreDepartamento)
                ));

        cq.orderBy(getEntityManager().getCriteriaBuilder().asc(registro.get("nidDepartamentoCoordenadas")));
        javax.persistence.Query q = getEntityManager().createQuery(cq);

        return q.getResultList();
    }

}
