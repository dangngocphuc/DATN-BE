package com.example.daphoneapple.domain.dto.req;

import com.example.daphoneapple.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link User} entity
 */
@Data
public class ReqRegisterUserDto implements Serializable {
    @NotNull(message = "Username không được null")
    @NotEmpty(message = "Username không được để trống")
    private final String username;

    @NotNull(message = "Password không được null")
    @NotEmpty(message = "Password không được để trống")
    private final String password;
    @NotNull(message = "Email không được null")
    @NotEmpty(message = "Email không được để trống")
    private final String email;
    @NotNull(message = "Address không được null")
    @NotEmpty(message = "Address không được để trống")
    private final String address;
    @NotNull(message = "PhoneNumber không được null")
    @NotEmpty(message = "PhoneNumber không được để trống")
    private final Integer phoneNumber;
    @NotNull(message = "Gender không được null")
    @NotEmpty(message = "Gender không được để trống")
    private final Boolean gender;
    @NotNull(message = "Fullname không được null")
    @NotEmpty(message = "Fullname không được để trống")
    private final String fullName;
}