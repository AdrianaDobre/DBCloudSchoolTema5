package com.dobreadrianaliatema5.dobreadrianaliatema5.controller;

import com.dobreadrianaliatema5.dobreadrianaliatema5.dto.CommandDTO;
import com.dobreadrianaliatema5.dobreadrianaliatema5.model.Command;
import com.dobreadrianaliatema5.dobreadrianaliatema5.service.CommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("command")
public class CommandController {
    private final CommandService commandService;

    @GetMapping("/all")
    public List<Command> getAllCommands() {
        return commandService.getAllCommands();
    }

    @GetMapping("/dto")
    public List<CommandDTO> getCommandsDTO() {
        return commandService.getCommandsDTO();
    }

    @GetMapping("{id}")
    public Command getById(@PathVariable Integer id) {
        return commandService.getById(id);
    }

    @PostMapping
    public Command insertCommand(@RequestBody Command command){
        return commandService.insertCommand(command);
    }

    @PutMapping
    public Command updateCommand(@RequestBody Command command) {
        return commandService.updateCommand(command);
    }

    @DeleteMapping("{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        commandService.deleteById(id);
    }
}
