package com.enterprice.appMart.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long o_id;

    @Column(name = "o_quantity")
    private int o_quantity;

    private LocalDate o_date;

    @ManyToOne
    @JoinColumn(name = "p_id")
    private ProductModel productModel;

    @ManyToOne
    @JoinColumn(name = "c_id")
    private CustomerModel customerModel;

    public OrderModel(){}
    //Setter

    public  OrderModel(int o_quantity,LocalDate o_date,CustomerModel customerModel,ProductModel productModel){
        this.customerModel=customerModel;
        this.productModel=productModel;
        this.o_date=o_date;
        this.o_quantity=o_quantity;
    }

    //getter

    public int getO_quantity() {
        return o_quantity;
    }

    public LocalDate  getO_date() {
        return o_date;
    }
    public CustomerModel getCustomerModel(){
        return customerModel;
    }

    public ProductModel getProductModel() {
        return productModel;
    }
}
