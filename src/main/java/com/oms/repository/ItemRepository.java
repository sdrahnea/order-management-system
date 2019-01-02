package com.oms.repository;

import com.oms.model.Item;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sdrahnea
 */
public interface ItemRepository extends CrudRepository<Item, Long> {

}