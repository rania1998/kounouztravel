package com.pfe.kounouz.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.kounouz.travel.entitie.UnderCategory;
import com.pfe.kounouz.travel.service.UnderCategoryService;


@RequestMapping
@RestController
public class UnderCategoryController {
	
	@Autowired
	private UnderCategoryService UnderCategoryService ;

	
	@RequestMapping(value = "/UnderCategory/UnderCategoryManager", method = RequestMethod.GET)
	public List<UnderCategory> findAll() {
		return UnderCategoryService.findAllUnderCategory();
	}

	@RequestMapping(value = "/UnderCategory/UnderCategoryById/{id}", method = RequestMethod.GET)
	public UnderCategory getUnderCategoryById(@PathVariable("id") Long id) {
		return UnderCategoryService.findOneUnderCategory(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/UnderCategory/deleteUnderCategory")
	public void deleteUnderCategory(@RequestBody UnderCategory UnderCategory) {
		UnderCategoryService.deleteUnderCategory(UnderCategory);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/UnderCategory/saveUnderCategory")
	public void saveUnderCategory(@RequestBody UnderCategory UnderCategory) {
		UnderCategoryService.saveUnderCategory(UnderCategory);}

}
