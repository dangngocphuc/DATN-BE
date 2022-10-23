package com.example.daphoneapple.repository;

import com.example.daphoneapple.entity.OptionContainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionContainerRepository extends JpaRepository<OptionContainer, Long> {
}