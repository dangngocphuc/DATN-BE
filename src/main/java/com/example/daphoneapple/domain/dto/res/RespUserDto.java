package com.example.daphoneapple.domain.dto.res;

import com.example.daphoneapple.entity.User;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link User} entity
 */
@Data
public class RespUserDto implements Serializable {
    private final String username;
    private final String email;
    private final String address;
    private final Integer phoneNumber;
    private final Boolean gender;
    private final String fullName;
    private final LocalDate createDate;
    private final Boolean status;
}