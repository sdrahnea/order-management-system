package com.oms.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author sdrahnea
 */
public interface ISecurityUserService extends UserDetailsService {

    User register(User user);
}
