package com.crudbasic.api.models.repos;

import com.crudbasic.api.models.entities.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product,Long>{
    
}
