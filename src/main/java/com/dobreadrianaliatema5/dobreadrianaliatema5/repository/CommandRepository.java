package com.dobreadrianaliatema5.dobreadrianaliatema5.repository;

import com.dobreadrianaliatema5.dobreadrianaliatema5.model.Command;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommandRepository extends CrudRepository<Command, Integer> {
    List<Command> findAll();
}
