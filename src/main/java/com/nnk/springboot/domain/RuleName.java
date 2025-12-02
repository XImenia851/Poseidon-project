package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Entity
@Table(name = "rulename")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RuleName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank
    @Column(name = "name", length = 30, nullable = false)
    private String name;

    @NotBlank
    @Column(name = "description", length = 300)
    private String description;

    @NotBlank
    @Column(name = "json", length = 100)
    private String json;

    @NotBlank
    @Column(name = "template", length = 100)
    private String template;

    @NotBlank
    @Column(name = "sqlStr", length = 100)
    private String sqlStr;

    @NotBlank
    @Column(name = "sqlPart", length = 100)
    private String sqlPart;
}
