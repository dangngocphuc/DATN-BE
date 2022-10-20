package com.example.daphoneapple.entity;


import javax.persistence.*;

@Entity
@Table(name = "OPTION_CONTAINER")
public class OptionContainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OC_Id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Product_detail_id")
    private ProductDetail productDetail;

    @ManyToOne
    @JoinColumn(name = "Option_id")
    private Option option;

    @ManyToOne
    @JoinColumn(name = "Option_value_id")
    private OptionValue optionValue;

}