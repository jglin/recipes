package com.example.recipes.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.recipes.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, String> {

}
