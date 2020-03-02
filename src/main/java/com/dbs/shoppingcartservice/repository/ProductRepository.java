package com.dbs.shoppingcartservice.repository;

import com.dbs.shoppingcartservice.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
