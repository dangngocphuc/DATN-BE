package com.example.daphoneapple.repository;

import com.example.daphoneapple.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}