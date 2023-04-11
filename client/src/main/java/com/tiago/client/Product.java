package com.tiago.client;

public record Product(
        String name,
        Float price,
        String description,
        String imageUrl
){}