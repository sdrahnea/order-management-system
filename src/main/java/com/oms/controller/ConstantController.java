package com.oms.controller;

import com.oms.model.Constant;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/constant")
public class ConstantController extends AbstractController<Constant> {
}