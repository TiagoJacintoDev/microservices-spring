package com.tiago.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductClient productClient;

    @GetMapping
    public Collection<Product> getProducts() {
        return productClient.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(UUID id) {
        return productClient.getProductById(id);
    }

    @PostMapping
    public Product createProduct(Product product) {
        return productClient.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(UUID id, Product product) {
        return productClient.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(UUID id) {
        productClient.deleteProduct(id);
    }
}
