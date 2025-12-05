package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

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
    private String benchmark = "";

    @Column(name = "tradeDate")
    private java.sql.Timestamp tradeDate;

    @Column(name = "security")
    private String security = "";

    @Column(name = "status")
    private String status = "";

    @Column(name = "trader")
    private String trader = "";

    @Column(name = "book")
    private String book = "";

    @Column(name = "creationName")
    private String creationName = "";

    @Column(name = "creationDate")
    private java.sql.Timestamp creationDate;

    @Column(name = "revisionName")
    private String revisionName = "";

    @Column(name = "revisionDate")
    private java.sql.Timestamp revisionDate;

    @Column(name = "dealName")
    private String dealName = "";

    @Column(name = "deal_type")
    private LocalDateTime dealType;

    @Column(name = "sourceListId")
    private String sourceListId = "";

    @Column(name = "side")
    private String side = "";
}