package com.example.daphoneapple.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link com.example.daphoneapple.entity.Image} entity
 */
@Data
public class ImageDto implements Serializable {
    private final Long id;
    private final String imgUrl;
    private final LocalDate createDate;
    private final String imgType;
    private final Boolean status;
}