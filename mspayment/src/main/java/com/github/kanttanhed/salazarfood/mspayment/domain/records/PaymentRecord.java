package com.github.kanttanhed.salazarfood.mspayment.domain.records;

import com.github.kanttanhed.salazarfood.mspayment.domain.enums.Status;

import java.math.BigDecimal;

public record PaymentRecord(
        Long id,
        BigDecimal valor,
        String nome,
        String numero,
        String expiracao,
        String cofigo,
        Status status,
        Long formasDePagamentoId,
        Long pedidoId) {
}
