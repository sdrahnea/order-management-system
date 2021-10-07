package com.oms.repository;

import com.oms.model.security.SecurityUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 *
 * @author sdrahnea
 */
@Repository
public interface SecurityUserDto extends JpaRepository<SecurityUser,Long> {

    Optional<SecurityUser> findByUsername(String username);

}
