package com.crudbasic.api.models.repos;

import com.crudbasic.api.models.entities.Category;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category,Long>{
    
}
