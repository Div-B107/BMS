package com.div.services.impl;

import com.div.models.User;
import com.div.services.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Override
    public Optional<User> findByFin(String finCode) {
        return Optional.empty();
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }
}
