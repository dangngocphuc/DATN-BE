package com.example.daphoneapple.repository;

import com.example.daphoneapple.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}