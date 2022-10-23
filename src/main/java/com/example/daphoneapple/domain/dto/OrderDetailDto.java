package com.example.daphoneapple.domain.dto;

import com.example.daphoneapple.entity.OrderDetail;
import lombok.Data;

import java.io.Serializable;


/**
 * A DTO for the {@link OrderDetail} entity
 */
@Data
public class OrderDetailDto implements Serializable {
    private final Double price;
    private final Long quantity;
    private final Double priceDiscount;
}