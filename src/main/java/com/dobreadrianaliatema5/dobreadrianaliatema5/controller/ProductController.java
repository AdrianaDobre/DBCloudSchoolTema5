package com.dobreadrianaliatema5.dobreadrianaliatema5.controller;

import com.dobreadrianaliatema5.dobreadrianaliatema5.dto.ProductDTO;
import com.dobreadrianaliatema5.dobreadrianaliatema5.model.Product;
import com.dobreadrianaliatema5.dobreadrianaliatema5.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/dto")
    public List<ProductDTO> getProductsDTO() {
        return productService.getProductsDTO();
    }

    @GetMapping("{id}")
    public Product getById(@PathVariable Integer id) {
        return productService.getById(id);
    }

    @PostMapping
    public Product insertProduct(@RequestBody Product product){
        return productService.insertProduct(product);
    }

    @PutMapping("{id}")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteById(id);
    }
}
