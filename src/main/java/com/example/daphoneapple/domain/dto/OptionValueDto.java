package com.example.daphoneapple.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.daphoneapple.entity.OptionValue} entity
 */
@Data
public class OptionValueDto implements Serializable {
    private final Long id;
    private final String value;
    private final Boolean status;
}