package com.dbs.shoppingcartservice.repository;

import com.dbs.shoppingcartservice.model.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Integer> {
}
