package com.example.daphoneapple.domain.dto.req;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link com.example.daphoneapple.entity.Order} entity
 */
@Data
public class ReqOrderDto implements Serializable {

    @NotEmpty(message = "Không được để trống email")
    private final String email;
    @NotEmpty(message = "Không được để trống số điện thoại")
    private final Integer phoneNumber;
    @NotEmpty(message = "Không được để trống họ tên")
    private final String customerName;
    @NotEmpty(message = "Không được để trống địa chỉ")
    private final String address;

    @NotNull(message = "Không được để trống tổng tiền")
    @Min(value = 0, message = "Tổng tiền lớn hơn 0")
    private final Double totalPrice;
    private final String description;
    @NotEmpty(message = "Không được để trống phương thức thanh toán")
    private final String payment;


}