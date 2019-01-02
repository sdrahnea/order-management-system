package com.oms.repository;

import com.oms.model.Inventory;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sdrahnea
 */
public interface InventoryRepository extends CrudRepository<Inventory, Long> {

}