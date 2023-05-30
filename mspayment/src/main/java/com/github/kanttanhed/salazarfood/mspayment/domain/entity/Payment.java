package com.github.kanttanhed.salazarfood.mspayment.domain.entity;

import com.github.kanttanhed.salazarfood.mspayment.domain.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payments")
public class Payment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    @Positive
    private BigDecimal valor;

    @NotNull
    @Size(max = 100 )
    private String nome;

    @NotNull
    @Size(max = 19 )
    private String numero;

    @NotNull
    @Size(max = 7 )
    private String expiracao;

    @NotNull
    @Size(max = 3, min = 3)
    private String codigo;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @NotNull
    private Long pedidoId;

    @NotNull
    private Long formaDePagamentoId;

}
