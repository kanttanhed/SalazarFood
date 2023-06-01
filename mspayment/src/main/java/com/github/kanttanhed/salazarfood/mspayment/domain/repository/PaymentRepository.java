package com.github.kanttanhed.salazarfood.mspayment.domain.repository;

import com.github.kanttanhed.salazarfood.mspayment.domain.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
