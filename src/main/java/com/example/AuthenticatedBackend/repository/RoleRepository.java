package com.example.AuthenticatedBackend.repository;

import com.example.AuthenticatedBackend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {

    Optional<Role>findByAuthority(String authority);
}
