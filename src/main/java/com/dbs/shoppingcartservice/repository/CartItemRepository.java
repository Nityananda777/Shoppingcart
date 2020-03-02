package com.dbs.shoppingcartservice.repository;

import com.dbs.shoppingcartservice.model.CartItem;
import com.dbs.shoppingcartservice.model.CartItemId;
import org.springframework.data.repository.CrudRepository;

public interface CartItemRepository extends CrudRepository<CartItem, CartItemId> {
}
