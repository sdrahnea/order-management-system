package com.oms.controller;

import com.oms.model.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/item")
public class ItemController extends AbstractController<Item> {
}