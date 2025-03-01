package com.example.shoppingmall.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data  // Lombok annotation to generate Getters, Setters, toString, etc.
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String manufacturer;
    private double price;
    private int quantity;
    private int threshold;
}
