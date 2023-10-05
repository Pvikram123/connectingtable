package com.vikram.CreatingTable.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ADDRESS")
public class Useraddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="add_id")
    private int address_id;

    private String addressType;
//     @OneToOne(mappedBy ="useraddress")
//     private  Userdata userdata;

}
