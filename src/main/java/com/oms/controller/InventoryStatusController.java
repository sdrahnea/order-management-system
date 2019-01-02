package com.oms.controller;

import com.oms.model.InventoryStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/inventory-status")
public class InventoryStatusController extends AbstractController<InventoryStatus> {
}