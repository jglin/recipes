package com.example.recipes.services;

import java.util.Set;

import com.example.recipes.commands.UnitOfMeasureCommand;

public interface UnitOfMeasureService {
	
	Set<UnitOfMeasureCommand> listAllUoms();

}
