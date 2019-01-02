package com.oms.controller.data;

/**
 *
 * @author sdrahnea
 */

import com.oms.controller.AbstractController;
import com.oms.model.data.LastName;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/last-name")
public class LastNameController extends AbstractController<LastName> {
}