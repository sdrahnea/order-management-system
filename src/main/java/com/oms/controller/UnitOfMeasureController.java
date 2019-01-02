package com.oms.controller;

import com.oms.model.UnitOfMeasure;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/unit-of-measure")
public class UnitOfMeasureController extends AbstractController<UnitOfMeasure> {
}