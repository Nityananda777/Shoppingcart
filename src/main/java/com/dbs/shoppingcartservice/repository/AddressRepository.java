package com.dbs.shoppingcartservice.repository;

import com.dbs.shoppingcartservice.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}
