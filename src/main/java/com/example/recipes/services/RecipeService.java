package com.example.recipes.services;

import java.util.Set;

import com.example.recipes.commands.RecipeCommand;
import com.example.recipes.domain.Recipe;

public interface RecipeService {
	
	Set<Recipe> getRecipes();
	
	Recipe findById(String id);
	
	RecipeCommand findCommandById(String id);
	
	RecipeCommand saveRecipeCommand(RecipeCommand command);
	
	void deleteById(String idToDelete);
}
