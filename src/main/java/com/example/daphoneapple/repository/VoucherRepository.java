package com.example.daphoneapple.repository;

import com.example.daphoneapple.entity.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoucherRepository extends JpaRepository<Voucher, Long> {
}