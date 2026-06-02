package com.enterprice.appMart.model;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String p_name;
    private double p_price;

    public ProductModel(){}

    //Setter

    public void setP_name(String p_name) {
            this.p_name = p_name;
    }
    public void setP_price(double p_price) {this.p_price = p_price;}

    //Getter
    public String getP_name() {
        return p_name;
    }
    public double getP_price() {
        return p_price;
    }
}
