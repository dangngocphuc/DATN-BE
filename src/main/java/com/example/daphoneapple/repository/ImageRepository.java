package com.example.daphoneapple.repository;

import com.example.daphoneapple.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {
}
