package com.enterprice.appMart.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name="customer")
@Data
public class CustomerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;

    private String first_name;
    private String last_name;
    private String email;
    private String ph_no;
    private String password;
    private String Address;
    private String gender;
    private Enum role;
    private int point;
    private LocalDateTime open_date;
    private LocalDateTime update_date;
}
