package com.enterprice.appMart.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "CartItem")
@Data
public class CartItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long cartId;
    private long productId;
    private int quantity;
    private BigDecimal price;
}
