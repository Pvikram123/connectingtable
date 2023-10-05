package com.vikram.CreatingTable.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "INCOME")
public class UserincomeType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="INC")
    private int id;
    private String incomeType;
    private String incomePercentage;

    @OneToMany
    @JoinColumn(name = "edit",referencedColumnName = "INC")
    private List<Userincome> userincome;

}
