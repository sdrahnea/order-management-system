package com.oms.controller;

import com.oms.model.ChartType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/chart-type")
public class ChartTypeController extends AbstractController<ChartType> {
}