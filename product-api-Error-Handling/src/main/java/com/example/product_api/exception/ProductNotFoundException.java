package com.example.product_api.exception;

public class ProductNotFoundException extends  RuntimeException{

    public ProductNotFoundException(Long id)
    {
        super("Product not found-"+id);
    }
}
