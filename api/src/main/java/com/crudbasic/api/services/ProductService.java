package com.crudbasic.api.services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.crudbasic.api.models.entities.Product;
import com.crudbasic.api.models.repos.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }

    public Product save(Product product){ // bisa untuk SAVE dan UPDATE
        return productRepo.save(product);        
    }

    public Product findOne(Long id){
        Optional<Product> product = productRepo.findById(id);
        if(!product.isPresent()) {
            return null;
        }
        return product.get();
    }

    public void removeOne(Long id){
        productRepo.deleteById(id);
    }

}
