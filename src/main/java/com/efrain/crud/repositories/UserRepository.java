package com.efrain.crud.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.efrain.crud.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

   boolean existsByUsername(String username);

   Optional<User> findByUsername(String username);
   
}