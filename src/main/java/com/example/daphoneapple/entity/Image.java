package com.example.daphoneapple.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Data
@Entity
@Table(name = "IMAGES")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imgUrl;

    private LocalDate createDate;

    private String imgType;

    @Column(name = "Image_status")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "Product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "Product_Accessories_id")
    private ProductAccessories productAccessories;
}