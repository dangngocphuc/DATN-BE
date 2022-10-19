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
@Table(name = "Order_status")
public class OrderStatus {
    @Id
    private Long id;

    private String name;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date createDate;

    @Temporal(TemporalType.DATE)
    private Date updateDate;


}
