package com.div.services;

import com.div.models.Role;


import java.util.Optional;
import java.util.Set;

public interface RoleService {


    Optional<Role> getRoleById(Long id);

    Set<Role> getAllRoles();


    void add(Role role);


}
