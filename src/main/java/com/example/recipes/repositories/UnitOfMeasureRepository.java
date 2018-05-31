package com.example.recipes.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.recipes.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, String> {
	
	Optional<UnitOfMeasure> findByDescription(String description);

}
