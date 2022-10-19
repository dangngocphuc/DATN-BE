package com.example.daphoneapple.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ORDER_DETAILS")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double price;
    private Long quantity;
    private Double priceDiscount;

    @ManyToOne
    @JoinColumn(name = "Order_id")
    private Order order;
}
