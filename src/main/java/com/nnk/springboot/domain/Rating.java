package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "rating")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank
    @Column(name = "moodysRating", length = 30, nullable = false)
    private String mooodysRating;

    @NotBlank
    @Column(name = "sandRating", length = 30, nullable = false)
    private String sandRating;

    @NotBlank
    @Column(name = "fitchRating", length = 30, nullable = false)
    private String fitchRating;

    @NotBlank
    @Column(name = "orderNumber")
    private Integer orderNumber;
}
