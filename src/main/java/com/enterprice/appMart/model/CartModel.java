package com.enterprice.appMart.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "Cart")
@Data
public class CartModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long userId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
