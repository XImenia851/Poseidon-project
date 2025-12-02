package com.nnk.springboot.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;


@Entity
@Table(name = "curvepoint")
public class CurvePoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;


    @NotBlank
    @Column(name = "curveId")
    private Integer curveId;

    @NotBlank
    @Column(name = "asOfDate")
    private Timestamp asOfDate;

    @NotBlank
    @Column(name = "term")
    private Double term;

    @NotBlank
    @Column(name = "value")
    private Double value;

    @NotBlank
    @Column(name = "creationDate")
    private Timestamp creationDate;
}
