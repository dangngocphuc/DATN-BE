package com.example.daphoneapple.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "ROLES")
public class Role {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name = "Role_status")
    private Boolean status;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<UserRole> roleList;


}