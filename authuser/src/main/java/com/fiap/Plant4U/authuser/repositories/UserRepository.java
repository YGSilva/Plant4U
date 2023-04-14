package com.fiap.Plant4U.authuser.repositories;

import com.fiap.Plant4U.authuser.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
