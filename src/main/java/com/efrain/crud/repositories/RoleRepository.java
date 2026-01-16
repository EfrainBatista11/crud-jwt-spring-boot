package com.efrain.crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.efrain.crud.entities.Role;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long>{

    Optional<Role> findByName(String name);

}
