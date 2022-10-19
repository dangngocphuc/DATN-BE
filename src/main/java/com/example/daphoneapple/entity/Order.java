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
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderCode;
    private String email;
    private Integer phoneNumber;
    private String customerName;
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
}
