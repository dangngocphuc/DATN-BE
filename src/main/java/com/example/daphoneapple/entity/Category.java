package com.example.daphoneapple.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CATEGORIES")
public class Category {
    @Id
    private Long id;

    private String name;

    private Boolean status;



}
