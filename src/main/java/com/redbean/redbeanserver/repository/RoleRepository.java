package com.redbean.redbeanserver.repository;


import com.redbean.redbeanserver.models.ERole;
import com.redbean.redbeanserver.models.Role;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository {
    Optional<Role> findByName(ERole name);
}
