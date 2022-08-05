package com.dobreadrianaliatema5.dobreadrianaliatema5.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private Date paymentDate;

    @NotNull
    private double amount;

    @ManyToOne
    private Customer customer;
}
