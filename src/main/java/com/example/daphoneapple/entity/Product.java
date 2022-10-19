package com.example.daphoneapple.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productCode;

    @Temporal(TemporalType.DATE)
    private Date createDate;

    private String description;
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "Cate_id")
    private Category category;

    @OneToOne
    @JoinColumn(name = "Voucher_id")
    private Voucher voucher;

}
