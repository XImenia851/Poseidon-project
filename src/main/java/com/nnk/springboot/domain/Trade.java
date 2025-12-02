package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;


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

    @NotBlank
    @Column(name = "account", length = 30, nullable = false)
    private String account;

    @NotBlank
    @Column(name = "type", length = 30, nullable = false)
    private String type;

    @NotBlank
    @Column(name = "buyQuantity")
    private double buyQuantity;

    @NotBlank
    @Column(name = "sellQuantity")
    private double sellQuantity;

    @NotBlank
    @Column(name = "buyPrice")
    private double buyPrice;

    @NotBlank
    @Column(name = "sellPrice")
    private double sellPrice;

    @NotBlank
    @Column(name = "benchmark", length = 30, nullable = false)
    private String benchmark;

    @NotBlank
    @Column(name = "tradeDate")
    private Timestamp tradeDate;

    @NotBlank
    @Column(name = "security", length = 30, nullable = false)
    private String security;

    @NotBlank
    @Column(name = "status", length = 30, nullable = false)
    private String status;

    @NotBlank
    @Column(name = "trader", length = 30, nullable = false)
    private String trader;

    @NotBlank
    @Column(name = "book", length = 30, nullable = false)
    private String book;

    @NotBlank
    @Column(name = "creationName", length = 30, nullable = false)
    private String creationName;;

    @NotBlank
    @Column(name = "creationDate")
    private Timestamp creationDate;

    @NotBlank
    @Column(name = "revisionName", length = 30, nullable = false)
    private String revisionName;

    @NotBlank
    @Column(name = "revisionDate")
    private Timestamp revisionDate;

    @NotBlank
    @Column(name = "dealName")
    private String dealName;

    @NotBlank
    @Column(name = "dealType")
    private Timestamp dealType;

    @NotBlank
    @Column(name = "sourceListId")
    private String sourceListId;

    @NotBlank
    @Column(name = "side", length = 30, nullable = false)
    private String side;

}
