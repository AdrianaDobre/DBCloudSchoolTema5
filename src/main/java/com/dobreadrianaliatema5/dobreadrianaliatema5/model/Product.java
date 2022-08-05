package com.dobreadrianaliatema5.dobreadrianaliatema5.model;

import com.sun.istack.NotNull;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Column(name = "code")
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private Integer stock;

    @NotNull
    private double price;

    @OneToMany
    private List<CommandDetail> commandDetails;
}

