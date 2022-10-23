package com.example.daphoneapple.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.daphoneapple.entity.Category} entity
 */
@Data
public class CategoryDto implements Serializable {
    private final String name;
}