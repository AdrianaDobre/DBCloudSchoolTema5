package com.dobreadrianaliatema5.dobreadrianaliatema5.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private String name;
    private Integer stock;
    private double price;
}
