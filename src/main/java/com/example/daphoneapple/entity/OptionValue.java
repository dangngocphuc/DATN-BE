package com.example.daphoneapple.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "OPTION_VALUES")
public class OptionValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Option_value_id")
    private Long id;

    @Column(name = "Option_value")
    private String value;

    @Column(name = "Option_values_status")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "Option_id")
    private Option option;

    @OneToMany(mappedBy = "optionValue",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<OptionContainer> optionContainerList;
}