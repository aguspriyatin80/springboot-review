package com.crudbasic.api.controllers;

import com.crudbasic.api.models.entities.Product;
import com.crudbasic.api.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping
    public Iterable<Product> findAll(){
        return productService.findAll();
    }
}
