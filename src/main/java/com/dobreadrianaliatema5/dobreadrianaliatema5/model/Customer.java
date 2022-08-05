package com.dobreadrianaliatema5.dobreadrianaliatema5.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @Column(unique=true)
    private String username;

    @NotNull
    private String lastName;

    @NotNull
    private String firstName;

    @NotNull
    private String phone;

    @NotNull
    private String address;

    @NotNull
    private String city;

    private String postalCode;

    @NotNull
    private String country;

    @OneToMany
    private List<Payment> paymentsList;

    @OneToMany
    private List<Command> commandsList;
}
