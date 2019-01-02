package com.oms.controller;

import com.oms.model.UnitType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/unit-type")
public class UnitTypeController extends AbstractController<UnitType> {
}