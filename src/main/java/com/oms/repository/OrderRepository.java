package com.oms.repository;

import com.oms.model.Order;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sdrahnea
 */
public interface OrderRepository extends CrudRepository<Order, Long> {

}