package com.example.daphoneapple.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "Username",unique = true)
    private String username;

    private String password;
    @Column(unique = true)
    private String email;
    private String address;
    @Column(unique = true)
    private Integer phoneNumber;
    private Boolean gender;
    private String fullName;
    private Boolean status;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<UserRole> userRoles;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Order> list;


}
