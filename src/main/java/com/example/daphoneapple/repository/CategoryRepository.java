package com.example.daphoneapple.repository;

import com.example.daphoneapple.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
