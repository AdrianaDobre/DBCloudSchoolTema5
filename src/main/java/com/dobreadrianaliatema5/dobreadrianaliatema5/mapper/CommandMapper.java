package com.dobreadrianaliatema5.dobreadrianaliatema5.mapper;

import com.dobreadrianaliatema5.dobreadrianaliatema5.dto.CommandDTO;
import com.dobreadrianaliatema5.dobreadrianaliatema5.model.Command;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommandMapper {
    CommandDTO toCommandDTO(Command command);
}
