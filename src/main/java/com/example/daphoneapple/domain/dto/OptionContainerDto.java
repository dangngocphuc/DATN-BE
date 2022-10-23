package com.example.daphoneapple.domain.dto;


import com.example.daphoneapple.entity.OptionContainer;
import lombok.Data;

import java.io.Serializable;


/**
 * A DTO for the {@link OptionContainer} entity
 */
@Data
public class OptionContainerDto implements Serializable {
    private final Long id;
}