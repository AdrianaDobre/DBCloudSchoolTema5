package com.dobreadrianaliatema5.dobreadrianaliatema5.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Command {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private Date orderDate;

    private Date shippedDate;

    @NotNull
    private String status;

    private String comments;

    @ManyToOne
    private Customer customer;

    @OneToMany
    private List<CommandDetail> commandDetailsList;
}
