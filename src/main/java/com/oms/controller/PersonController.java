package com.oms.controller;

import com.oms.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/person")
public class PersonController extends AbstractController<Person> {
}