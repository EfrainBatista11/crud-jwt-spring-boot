package com.efrain.crud.services;

import java.util.List;

import com.efrain.crud.entities.User;

public interface UserService {

    List<User> findAll();
    
    User save(User user);

    boolean existsByUsername(String username);
}
