package com.dobreadrianaliatema5.dobreadrianaliatema5.service;

import com.dobreadrianaliatema5.dobreadrianaliatema5.dto.CommandDTO;
import com.dobreadrianaliatema5.dobreadrianaliatema5.mapper.CommandMapper;
import com.dobreadrianaliatema5.dobreadrianaliatema5.model.Command;
import com.dobreadrianaliatema5.dobreadrianaliatema5.repository.CommandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CommandService {
    private final CommandRepository commandRepository;
    private final CommandMapper commandMapper;
    public List<Command> getAllCommands() {
        return commandRepository.findAll();
    }

    public List<CommandDTO> getCommandsDTO(){
        return commandRepository.findAll().stream()
                .map(commandMapper::toCommandDTO)
                .collect(Collectors.toList());
    }

    public Command getById(Integer id) {
        return commandRepository.findById(id).get();
    }

    public Command insertCommand(Command command) {
        return commandRepository.save(command);
    }

    public Command updateCommand(Command command) {
        return commandRepository.save(command);
    }

    public void deleteById(Integer id) {
        commandRepository.deleteById(id);
    }
}
