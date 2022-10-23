package com.example.daphoneapple.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.daphoneapple.entity.Option} entity
 */
@Data
public class OptionDto implements Serializable {
    private final Long id;
    private final String name;
    private final String code;
    private final Boolean status;
}