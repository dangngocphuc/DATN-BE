package com.example.daphoneapple.domain.dto;

import com.example.daphoneapple.entity.Role;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Role} entity
 */
@Data
public class RoleDto implements Serializable {
    private final Integer id;
    private final String name;
}