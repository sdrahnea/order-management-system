package com.oms.model.security;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 *
 * @author sdrahnea
 */
@Entity
@Table(name = "users")
@Data
public class SecurityUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<SecurityRole> securityRoles;

}
