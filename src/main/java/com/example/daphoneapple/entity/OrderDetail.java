package com.example.daphoneapple.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Order_Details")
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
