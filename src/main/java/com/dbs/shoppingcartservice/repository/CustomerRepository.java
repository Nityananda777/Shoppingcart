package com.dbs.shoppingcartservice.repository;

import com.dbs.shoppingcartservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
  Iterable<Customer> findAllByOrderByIdAsc();
}
