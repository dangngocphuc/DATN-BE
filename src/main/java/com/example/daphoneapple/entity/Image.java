package com.example.daphoneapple.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "IMAGE")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imgUrl;
    @Temporal(TemporalType.DATE)
    private Date createDate;

    private String imgType;

    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "Product_id")
    private Product product;
}
