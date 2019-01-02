package com.oms.repository;

import com.oms.model.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sdrahnea
 */
public interface MessageRepository extends CrudRepository<Message, Long> {

}