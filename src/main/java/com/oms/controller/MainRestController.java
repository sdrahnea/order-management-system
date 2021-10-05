package com.oms.controller;

import com.oms.model.security.SecurityUser;
import com.oms.service.impl.SecurityUserService;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author sdrahnea
 */
@RestController
public class MainRestController {

    private final SecurityUserService userService;

    public MainRestController(SecurityUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/user/register")
    public SecurityUser register(@RequestBody SecurityUser user){
        return userService.register(user);
    }

}
