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

    @NotNull(message = "Buy Quantity is mandatory")
    @Column(name = "buyQuantity")
    private Double buyQuantity;

    @Column(name = "sellQuantity")
    private Double sellQuantity;

    @Column(name = "buyPrice")
    private Double buyPrice;

    @Column(name = "sellPrice")
    private Double sellPrice;

    @Column(name = "benchmark")
    private String benchmark = "";  // Valeur par défaut

    @Column(name = "tradeDate")
    private java.sql.Timestamp tradeDate;

    @Column(name = "security")
    private String security = "";  // Valeur par défaut

    @Column(name = "status")
    private String status = "";  // Valeur par défaut

    @Column(name = "trader")
    private String trader = "";  // Valeur par défaut

    @Column(name = "book")
    private String book = "";  // Valeur par défaut - C'EST LE PROBLÈME ACTUEL

    @Column(name = "creationName")
    private String creationName = "";  // Valeur par défaut

    @Column(name = "creationDate")
    private java.sql.Timestamp creationDate;

    @Column(name = "revisionName")
    private String revisionName = "";  // Valeur par défaut

    @Column(name = "revisionDate")
    private java.sql.Timestamp revisionDate;

    @Column(name = "dealName")
    private String dealName = "";  // Valeur par défaut

    @Column(name = "dealType")
    private String dealType = "";  // Valeur par défaut

    @Column(name = "sourceListId")
    private String sourceListId = "";  // Valeur par défaut

    @Column(name = "side")
    private String side = "";  // Valeur par défaut
}