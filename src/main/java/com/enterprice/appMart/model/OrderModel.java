package com.enterprice.appMart.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;;
    private String orderNumber;
    private long userId;
    private BigDecimal totalAmount;
    private Enum paymentStatus;
    private String shipping;
    private LocalDateTime orderAt;
}
