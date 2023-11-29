package com.example.tutorials.repository;

import com.example.tutorials.model.ERole;
import com.example.tutorials.model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel, Long> {
    Optional<RoleModel> findByName(ERole name);
}
