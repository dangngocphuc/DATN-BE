package com.example.daphoneapple.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String productCode;


    private LocalDate createDate;

    private String description;
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "Cate_id")
    private Category category;

    @OneToOne
    @JoinColumn(name = "Voucher_id")
    private Voucher voucher;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Option> optionList;



}
