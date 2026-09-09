package com.enterprice.appMart.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name="product")
@Data
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private int quantity;
    private long categoryId;
    private Enum status;
}
