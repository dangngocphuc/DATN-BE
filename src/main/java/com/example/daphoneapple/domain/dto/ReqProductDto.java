package com.example.daphoneapple.domain.dto;

import com.example.daphoneapple.entity.Category;
import com.example.daphoneapple.entity.Product;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link Product} entity
 */
@Data
public class ReqProductDto implements Serializable {
    private final String productCode;
    private final LocalDate createDate;
    private final String description;
    private final Boolean status;
    private final Long categoryId;
    private final Long voucherId;
    private final String[] imageUrl;
}