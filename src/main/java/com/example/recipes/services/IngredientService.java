package com.example.recipes.services;

import com.example.recipes.commands.IngredientCommand;

public interface IngredientService {
	
	IngredientCommand findByRecipeIdAndIngredientId(String recipeId, String ingredientId);
	
	IngredientCommand saveIngredientCommand(IngredientCommand command);
	
	void deleteById(String recipeId, String idToDelete);

}
