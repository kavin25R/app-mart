package com.enterprice.appMart.model;
import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class CustomerModel {
    public CustomerModel(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;

    private String c_name;
    private String c_email;

    //Setter
    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public void setC_email(String c_email) {
        this.c_email = c_email;
    }

    //getter

    public Long getC_id() {
        return c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public String getC_email() {
        return c_email;
    }
}
