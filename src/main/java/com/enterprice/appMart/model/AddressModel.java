package com.enterprice.appMart.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Addresses")
@Data
public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long user_id;
    private String fullName;
    private String ph_no;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;
}
