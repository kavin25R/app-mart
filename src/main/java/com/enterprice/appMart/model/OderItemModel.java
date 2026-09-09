package com.enterprice.appMart.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "OrderItem")
@Data
public class OderItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long orderId;
    private long cartId;
    private String productName;
    private int quantity;
    private BigDecimal price;
    private BigDecimal subTotal;
}
