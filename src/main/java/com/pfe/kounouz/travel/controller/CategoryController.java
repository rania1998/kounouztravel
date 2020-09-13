package com.pfe.kounouz.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.kounouz.travel.service.CategoryService;
import com.pfe.kounouz.travel.entitie.Category;



@RequestMapping
@RestController
public class CategoryController {

	@Autowired
	private CategoryService  CategoryService;

	@RequestMapping(value = "/Category/CategoryManager", method = RequestMethod.GET)
	public List<Category> findAll() {
		return CategoryService.findAllCategory();
	}

	@RequestMapping(value = "/Category/CategoryById/{id}", method = RequestMethod.GET)
	public Category getCategoryById(@PathVariable("id") Long id) {
		return CategoryService.findOneCategory(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Category/deleteCategory")
	public void deleteCategory(@RequestBody Category Category) {
		CategoryService.deleteCategory(Category);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/Category/saveCategory")
	public void saveCategory(@RequestBody Category Category) {
		 CategoryService.saveCategory(Category);

	}
}
