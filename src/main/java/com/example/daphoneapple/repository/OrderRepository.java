package com.example.daphoneapple.repository;

import com.example.daphoneapple.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}