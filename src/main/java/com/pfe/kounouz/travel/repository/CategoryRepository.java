package com.pfe.kounouz.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.kounouz.travel.entitie.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	Category findOnCategoryById(long id);
}
