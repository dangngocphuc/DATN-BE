package com.example.daphoneapple.domain.dto.res;

import com.example.daphoneapple.entity.Product;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link Product} entity
 */
@Data
public class RespProductDto implements Serializable {
    private final String productCode;
    private final LocalDate createDate;
    private final Double price;
    private final Integer discount;
    private final String description;
    private final Boolean status;
    private final String image;
}