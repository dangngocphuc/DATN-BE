package com.example.daphoneapple.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "VOUCHERS")
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date createDate;

    private Date startDate;
    private Date endDate;
    private Long count;
    private Double discount;
    private Integer type;
    private Boolean status;

    @OneToMany(mappedBy = "voucher",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Order> orders;

}
