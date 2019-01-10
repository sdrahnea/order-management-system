package com.oms.controller;

import com.oms.model.Dashboard;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/dashboard")
public class DashboardController extends AbstractController<Dashboard> {

}