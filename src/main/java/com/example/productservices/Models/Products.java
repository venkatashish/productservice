package com.example.productservices.Models;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Products {
    private Long id;
    private String imageUrl;
    private String description;
    private String title;
    private Category category;
    private double price;
}
