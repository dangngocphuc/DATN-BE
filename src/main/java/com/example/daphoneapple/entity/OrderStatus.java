package com.example.daphoneapple.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Table(name = "ORDER_STATUS")
public class OrderStatus {
    @Id
    private Long id;

    private String name;
    private String description;

    private LocalDate createDate;

    private LocalDate updateDate;


}