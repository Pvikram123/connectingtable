package com.vikram.CreatingTable.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name ="USERDATA")
public class Userdata {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name = "USERID")
    private int id;
    private String name;
    private String email;
     @OneToOne(cascade =CascadeType.ALL)
     @JoinColumn(name ="mainid")
    private Useraddress useraddress;
}
