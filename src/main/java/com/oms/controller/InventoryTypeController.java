package com.oms.controller;

import com.oms.model.InventoryType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/inventory-type")
public class InventoryTypeController extends AbstractController<InventoryType> {
}