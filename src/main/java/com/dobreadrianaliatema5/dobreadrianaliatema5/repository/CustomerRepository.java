package com.dobreadrianaliatema5.dobreadrianaliatema5.repository;

import com.dobreadrianaliatema5.dobreadrianaliatema5.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findAll();
}
