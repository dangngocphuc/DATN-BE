package com.example.daphoneapple.domain.dto;

import com.example.daphoneapple.entity.ProductAccessories;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link ProductAccessories} entity
 */
@Data
public class ProductAccessoriesDto implements Serializable {
    private final String model;
    private final String function;
    private final String output;
    private final String connectionJack;
    private final String maximumCharging;
    private final Long size;
    private final String technology;
    private final String manafaceture;
    private final String brand;
    private final String company;
    private final String batteryLife;
    private final String chargingCaseBatteryLife;
    private final String chargingPort;
    private final String audioTechnology;
    private final String compatibility;
    private final String convenience;
    private final String connectionTechnology;
    private final String control;
    private final String mass;
}