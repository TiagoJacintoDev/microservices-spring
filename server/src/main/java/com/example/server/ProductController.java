package com.example.server;

import org.springframework.web.bind.annotation.*;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public Collection<Product> getProducts() {
        return List.of(
                new Product(1, "Product 1", 1.0f, "Description 1", "https://picsum.photos/200"),
                new Product(2, "Product 2", 2.0f, "Description 2", "https://picsum.photos/200"),
                new Product(3, "Product 3", 3.0f, "Description 3", "https://picsum.photos/200"),
                new Product(4, "Product 4", 4.0f, "Description 4", "https://picsum.photos/200"),
                new Product(5, "Product 5", 5.0f, "Description 5", "https://picsum.photos/200")
        );
    }
}
