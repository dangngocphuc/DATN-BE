package com.example.daphoneapple.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "Username")
    private String userName;

    private String password;
    private String email;
    private String address;
    private Integer phoneNumber;
    private Boolean gender;
    private String fullName;
    private Boolean status;

    @OneToMany
    @JoinColumn(name = "Role_id")
    private Role role;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Order> list;


}
