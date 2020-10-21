/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.repository;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Omar
 */
@NoRepositoryBean
public interface ExtendedRepository<T, ID extends Serializable>
        extends JpaRepository<T, ID> {

    List<T> findAllByField(Object field, Object value);
}
