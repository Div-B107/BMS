package com.div.services.impl;

import com.div.models.Role;
import com.div.services.RoleService;

import java.util.Optional;
import java.util.Set;

public class RoleServiceImpl implements RoleService {
    @Override
    public Optional<Role> getRoleById(Long id) {
        return Optional.empty();
    }

    @Override
    public Set<Role> getAllRoles() {
        return null;
    }

    @Override
    public void add(Role role) {

    }
}
