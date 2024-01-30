package com.genfood.foodgenback.repository;

import com.genfood.foodgenback.model.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredients, String> { }
