package com.oms.controller;

import com.oms.model.UnitIndustry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/unit-industry")
public class UnitIndustryController extends AbstractController<UnitIndustry> {
}