package com.winter_spring_backend.winter_spring_backend.user.jpa;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
