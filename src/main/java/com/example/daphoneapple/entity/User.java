package com.example.daphoneapple.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
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
    private LocalDate createDate;
    private Boolean status;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<UserRole> userRoles;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> list;

    @PrePersist
    public void settingUserCreateDate(){
        this.createDate = LocalDate.now();
    }


}