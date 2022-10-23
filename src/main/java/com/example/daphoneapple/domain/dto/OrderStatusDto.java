package com.example.daphoneapple.domain.dto;

import com.example.daphoneapple.entity.OrderStatus;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link OrderStatus} entity
 */
@Data
public class OrderStatusDto implements Serializable {
    private final Long id;
    private final String name;
    private final String description;
    private final LocalDate createDate;
    private final LocalDate updateDate;
}