package com.example.daphoneapple.domain.dto;

import com.example.daphoneapple.entity.ProductDetail;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link ProductDetail} entity
 */
@Data
public class ProductDetailDto implements Serializable {
    private final String name;
    private final String screenTechnology;
    private final String resolution;
    private final String code;
    private final String camResolution;
    private final String film;
    private final String flashLight;
    private final String feature;
    private final String CPU;
    private final String cpuSpeed;
    private final String GPU;
    private final String RAM;
    private final String Capacity;
    private final String phonebook;
    private final String mobileNetwork;
    private final String GPS;
    private final String bluetooth;
    private final String batteryCapacity;
    private final String batteryType;
    private final String supportCharging;
    private final String technologyTheBattery;
    private final String advancedSecurity;
    private final String waterproofAndDustproof;
    private final String design;
    private final String materials;
    private final String size;
    private final String mass;
    private final String releaseTime;
    private final Integer quantity;
}