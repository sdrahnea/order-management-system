package com.oms.repository;

import com.oms.model.OrderStatus;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sdrahnea
 */
public interface OrderStatusRepository extends CrudRepository<OrderStatus, Long> {

}