package com.vikram.CreatingTable.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="EMP")
public class Userincome {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_emp_data")
    private int empId;
    private int empIncome;
    private long yerIncome;
}
