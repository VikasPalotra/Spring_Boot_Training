package com.example.product_api.service;

import com.example.product_api.entity.Product;
import com.example.product_api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
@Transactional
    public Product saveProduct(Product product)
    {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }

    public Optional<Product> findProductByID(Long id)
    {
        return productRepository.findById(id);
    }

    public void deleteProductById(Long id)
    {
         productRepository.deleteById(id);
    }

}
