package com.example.shoppingmall.service;

import com.example.shoppingmall.model.Product;
import com.example.shoppingmall.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product) {
        System.out.println("Received product: " + product);
        return productRepository.save(product);
    }
}

