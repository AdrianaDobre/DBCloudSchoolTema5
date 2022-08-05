package com.dobreadrianaliatema5.dobreadrianaliatema5.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommandDTO {
    private Date orderDate;
    private Date shippedDate;
    private String status;
}
