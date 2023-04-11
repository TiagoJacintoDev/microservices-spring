package com.tiago.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

@FeignClient(name = "api/products")
public interface ProductClient {
    @GetMapping
    Collection<Product> getProducts();

    @GetMapping("/{id}")
    Product getProductById(@PathVariable UUID id);

    @PostMapping
    Product createProduct(@RequestBody Product product);

    @PutMapping("/{id}")
    Product updateProduct(@PathVariable UUID id, @RequestBody Product product);

    @DeleteMapping("/{id}")
    void deleteProduct(@PathVariable UUID id);
}
