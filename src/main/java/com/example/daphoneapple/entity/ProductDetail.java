package com.example.daphoneapple.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUCT_DETAILS")
@Data
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Product_detail_id")
    private Long id;

    @Column(name = "Product_name")
    private String name;

    @Column(name = "Product_screen_technology")
    private String screenTechnology;

    @Column(name = "Product_resolution")
    private String resolution;

    @Column(name = "Product_code")
    private String code;

    @Column(name = "Product_cam_resolution")
    private String camResolution;

    @Column(name = "Product_film")
    private String film;

    @Column(name = "Product_flash_light")
    private String flashLight;

    @Column(name = "Product_feature")
    private String feature;

    @Column(name = "Product_CPU")
    private String CPU;

    @Column(name = "Product_cpu_speed")
    private String cpuSpeed;

    @Column(name = "Product_GPU")
    private String GPU;

    @Column(name = "Product_RAM")
    private String RAM;

    @Column(name = "Product_Capacity")
    private String Capacity;

    @Column(name = "Product_Phonebook")
    private String phonebook;

    @Column(name = "Product_mobile_network")
    private String mobileNetwork;

    @Column(name = "Product_GPS")
    private String GPS;

    @Column(name = "Product_Bluetooth")
    private String bluetooth;

    @Column(name = "Product_battery_capacity")
    private String batteryCapacity;

    @Column(name = "Product_battery_type")
    private String batteryType;

    @Column(name = "Product_support_charging")
    private String supportCharging;

    @Column(name = "Product_technology_the_battery")
    private String technologyTheBattery;

    @Column(name = "Product_advanced_security")
    private String advancedSecurity;

    @Column(name = "Product_waterproof and dustproof")
    private String waterproofAndDustproof;

    @Column(name = "Product_design")
    private String design;

    @Column(name = "Product_materials")
    private String materials;

    @Column(name = "Product_size")
    private String size;


    @Column(name = "Product_mass")
    private String mass;

    @Column(name = "Product_release_time")
    private String releaseTime;

    @Column(name = "Product_quantity")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "Product_id")
    private Product product;

    @OneToMany(mappedBy = "productDetail",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<OptionContainer> optionContainers;

}
