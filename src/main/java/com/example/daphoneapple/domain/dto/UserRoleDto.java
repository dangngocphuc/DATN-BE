package com.example.daphoneapple.domain.dto;

import com.example.daphoneapple.entity.UserRole;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link UserRole} entity
 */
@Data
public class UserRoleDto implements Serializable {
    private final Long id;
}