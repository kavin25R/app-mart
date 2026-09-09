package com.enterprice.appMart.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Payment")
@Data
public class PaymentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long orderId;
    private BigDecimal amount;
    private Enum paymentMethod;
    private Enum status;
    private String transactionId;
    private LocalDateTime paidAt;
}
