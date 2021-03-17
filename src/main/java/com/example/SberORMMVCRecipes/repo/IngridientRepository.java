package com.example.SberORMMVCRecipes.repo;

import com.example.SberORMMVCRecipes.model.CategoryRecept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngridientRepository  extends JpaRepository <CategoryRecept, String> {
}
