package com.example.shoppingmall.controller;

import com.example.shoppingmall.model.Product;
import com.example.shoppingmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        System.out.println("Received product: " + product);  // This should print actual data
        Product savedProduct = productService.addProduct(product);
        return ResponseEntity.ok(savedProduct);
    }
}
