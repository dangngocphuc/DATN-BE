package com.example.daphoneapple.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "OPTIONS")
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Option_id")
    private Long id;

    @Column(name = "Option_name")
    private String name;

    @Column(name = "Option_code")
    private String code;

    @Column(name = "Option_status")
    private Boolean status;

    @OneToMany(mappedBy = "option", cascade = CascadeType.ALL)
    private List<OptionValue> optionValues = new java.util.ArrayList<>();

    @OneToMany(mappedBy = "option",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<OptionContainer> optionContainers;

    @ManyToOne
    @JoinColumn(name = "Product_id")
    private Product product;
}