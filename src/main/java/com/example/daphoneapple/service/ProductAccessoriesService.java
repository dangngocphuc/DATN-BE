package com.example.daphoneapple.repository;

import com.example.daphoneapple.entity.ProductAccessories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductAccessoriesRepository extends JpaRepository<ProductAccessories, Long> {
}