package com.example.daphoneapple.domain.dto;

import com.example.daphoneapple.entity.Voucher;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link Voucher} entity
 */
@Data
public class VoucherDto implements Serializable {
    private final Long id;
    private final LocalDate createDate;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final Long count;
    private final Double discount;
    private final Integer type;
    private final Boolean status;
}