package com.example.daphoneapple.repository;

import com.example.daphoneapple.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
}