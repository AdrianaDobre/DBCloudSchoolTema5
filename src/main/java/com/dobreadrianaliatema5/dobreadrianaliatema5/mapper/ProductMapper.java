package com.dobreadrianaliatema5.dobreadrianaliatema5.mapper;

import com.dobreadrianaliatema5.dobreadrianaliatema5.dto.ProductDTO;
import com.dobreadrianaliatema5.dobreadrianaliatema5.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toProductDTO(Product product);
}
