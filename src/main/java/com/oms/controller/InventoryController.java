package com.oms.controller;

import com.oms.model.Inventory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/inventory")
public class InventoryController extends AbstractController<Inventory> {
}