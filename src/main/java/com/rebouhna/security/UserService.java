package com.rebouhna.security;

import java.util.Optional;

import com.rebouhna.entity.User;

public interface UserService {
    public Optional<User> getByUsername(String username);
}
