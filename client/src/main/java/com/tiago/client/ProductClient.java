package com.tiago.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

@FeignClient(name = "products")
public interface ProductClient {
    @GetMapping("/products")
    Collection<Product> getProducts();

    @GetMapping("products/{id}")
    Product getProductById(@PathVariable UUID id);

    @PostMapping("/products")
    Product createProduct(@RequestBody Product product);

    @PutMapping("products/{id}")
    Product updateProduct(@PathVariable UUID id, @RequestBody Product product);

    @DeleteMapping("products/{id}")
    void deleteProduct(@PathVariable UUID id);
}
