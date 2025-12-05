package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "trade")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tradeId")
    private Integer tradeId;

    @NotBlank(message = "Account is mandatory")
    @Column(name = "account", length = 30, nullable = false)
    private String account;

    @NotBlank(message = "Type is mandatory")
    @Column(name = "type", length = 30, nullable = false)
    private String type;

    // Utilisation de Double pour permettre la validation @NotNull
    @NotNull(message = "Buy Quantity is mandatory")
    @Column(name = "buyQuantity")
    private Double buyQuantity;
}