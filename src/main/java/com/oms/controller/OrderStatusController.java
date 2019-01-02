package com.oms.controller;

import com.oms.model.OrderStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/order-status")
public class OrderStatusController extends AbstractController<OrderStatus> {

}