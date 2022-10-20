package com.example.daphoneapple.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Order_id")
    private Long id;

    @Column(unique = true)
    private String orderCode;
    @Column(name = "Order_email",unique = true)
    private String email;
    @Column(unique = true)
    private Integer phoneNumber;
    private String customerName;
    @Column(name = "Order_address")
    private String address;
    private Double totalPrice;
    private String description;
    private Date shipDate;
    private String payment;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "Voucher_id")
    private Voucher voucher;

    @ManyToOne
    @JoinColumn(name = "Order_status_id")
    private OrderStatus orderStatus;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails ;


}