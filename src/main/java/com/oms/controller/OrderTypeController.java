package com.oms.controller;

import com.oms.model.OrderType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/order-type")
public class OrderTypeController extends AbstractController<OrderType> {


}