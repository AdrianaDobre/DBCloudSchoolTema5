package com.dobreadrianaliatema5.dobreadrianaliatema5.mapper;

import com.dobreadrianaliatema5.dobreadrianaliatema5.dto.CustomerDTO;
import com.dobreadrianaliatema5.dobreadrianaliatema5.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO toCustomerDTO(Customer customer);
}
