package com.dobreadrianaliatema5.dobreadrianaliatema5.service;

import com.dobreadrianaliatema5.dobreadrianaliatema5.dto.CustomerDTO;
import com.dobreadrianaliatema5.dobreadrianaliatema5.dto.ProductDTO;
import com.dobreadrianaliatema5.dobreadrianaliatema5.mapper.ProductMapper;
import com.dobreadrianaliatema5.dobreadrianaliatema5.model.Product;
import com.dobreadrianaliatema5.dobreadrianaliatema5.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public List<ProductDTO> getProductsDTO(){
        return productRepository.findAll().stream()
                .map(productMapper::toProductDTO)
                .collect(Collectors.toList());
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getById(Integer id) {
        return productRepository.findById(id).get();
    }

    public Product insertProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }
}
