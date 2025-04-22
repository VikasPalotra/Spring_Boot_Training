package com.example.product_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
//@Column(name = "title")
    String title;
    String category;
    Double price;


    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
