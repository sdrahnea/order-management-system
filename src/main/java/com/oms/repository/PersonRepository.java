package com.oms.repository;

import com.oms.model.Person;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sdrahnea
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

}