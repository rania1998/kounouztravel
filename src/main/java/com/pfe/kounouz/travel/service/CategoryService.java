package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.Category;

public interface CategoryService {

	public Category findOneCategory(Long id);

	public List<Category> findAllCategory();

	public Category saveCategory(Category Category);

	public void deleteCategory(Category Category);

}
