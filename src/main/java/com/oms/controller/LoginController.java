package com.oms.controller;

import org.springframework.stereotype.Component;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author sdrahnea
 */
@Component
@SessionScoped
public class LoginController {

  public String login() {
    return "main";
  }

}
