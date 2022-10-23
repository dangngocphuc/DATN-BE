package com.example.daphoneapple.domain.dto.res;

import com.example.daphoneapple.entity.OrderStatus;
import com.example.daphoneapple.entity.User;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * A DTO for the {@link com.example.daphoneapple.entity.Order} entity
 */
@Data
public class RespOrderDto implements Serializable {

    private final String email;
    private final Integer phoneNumber;
    private final String customerName;
    private final String address;
    private final Double totalPrice;
    private final String description;
    private final String payment;
    private final User user;
    private final OrderStatus orderStatus;

}