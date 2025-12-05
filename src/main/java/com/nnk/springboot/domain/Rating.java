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
    @Column(name = "moodys_rating", length = 30, nullable = false)
    private String moodysRating;

    @NotBlank
    @Column(name = "sand_rating", length = 30, nullable = false)
    private String sandRating;

    @NotBlank
    @Column(name = "fitch_rating", length = 30, nullable = false)
    private String fitchRating;

    @NotNull
    @Column(name = "order_number")
    private Integer orderNumber;
}
