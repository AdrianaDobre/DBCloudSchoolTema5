package com.dobreadrianaliatema5.dobreadrianaliatema5.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommandDetail {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private Integer quantity;

    @NotNull
    private double priceEach;

    @ManyToOne
    private Command command;

    @ManyToOne
    private Product product;
}
