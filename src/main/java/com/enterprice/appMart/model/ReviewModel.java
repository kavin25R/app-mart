package com.enterprice.appMart.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "Reviews")
@Data
public class ReviewModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long userId;
    private long productId;
    private int rating;
    private String comment;
    private LocalDateTime reviewAt;
}
