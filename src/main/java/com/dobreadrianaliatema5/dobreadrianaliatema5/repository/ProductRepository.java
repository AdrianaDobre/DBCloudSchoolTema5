package com.dobreadrianaliatema5.dobreadrianaliatema5.repository;

import com.dobreadrianaliatema5.dobreadrianaliatema5.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findAll();
}
