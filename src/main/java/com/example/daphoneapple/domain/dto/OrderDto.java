package com.example.daphoneapple.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link com.example.daphoneapple.entity.Order} entity
 */
@Data
public class OrderDto implements Serializable {
    private final String orderCode;
    private final String email;
    private final Integer phoneNumber;
    private final String customerName;
    private final String address;
    private final Double totalPrice;
    private final String description;
    private final Date shipDate;
    private final String payment;
}