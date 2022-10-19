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
@Table(name = "OPTIONS")
public class Option {
    @Id
}
