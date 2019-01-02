package com.oms.controller.data;

/**
 *
 * @author sdrahnea
 */

import com.oms.controller.AbstractController;
import com.oms.model.data.FirstName;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/first-name")
public class FirstNameController extends AbstractController<FirstName> {
}