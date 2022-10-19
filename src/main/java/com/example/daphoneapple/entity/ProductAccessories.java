package com.example.daphoneapple.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_ACCESSORIES")
@Data
public class ProductAccessories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Pa_model")
    private String model;

    @Column(name = "Pa_function")
    private String function;

    @Column(name = "Pa_output")
    private String output;

    @Column(name = "Pa_connection_jack")
    private String connectionJack;

    @Column(name = "Pa_maximum_charging_current")
    private String maximumCharging;

    @Column(name ="Pa_size")
    private Long size;

    @Column(name = "Pa_technology")
    private String technology;

    @Column(name = "Pa_manafaceture")
    private String manafaceture;

    @Column(name = "Pa_brand")
    private String brand;

    @Column(name = "Pa_company")
    private String company;

    @Column(name = "Pa_battery_life")
    private String batteryLife;

    @Column(name = "Pa_charging_case_battery_life")
    private String chargingCaseBatteryLife;

    @Column(name = "Pa_charging_port")
    private String chargingPort;

    @Column(name = "Pa_audio_technology")
    private String audioTechnology;

    @Column(name = "Pa_compatibility")
    private String compatibility;

    @Column(name = "Pa_convenience")
    private String convenience;

    @Column(name = "Pa_connection_technology")
    private String connectionTechnology;

    @Column(name = "Pa_control")
    private String control;

    @Column(name = "Pa_mass")
    private String mass;

    @ManyToOne
    @JoinColumn(name = "Cate_id")
    private Category category;
}
