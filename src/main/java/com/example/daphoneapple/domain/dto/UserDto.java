package com.example.daphoneapple.domain.dto;

import com.example.daphoneapple.entity.User;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link User} entity
 */
@Data
public class UserDto implements Serializable {
    private final Long Id;
    private final String username;
    private final String password;
    private final String email;
    private final String address;
    private final Integer phoneNumber;
    private final Boolean gender;
    private final String fullName;
    private final Boolean status;
}