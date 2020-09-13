package com.pfe.kounouz.travel.srviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.kounouz.travel.entitie.Category;
import com.pfe.kounouz.travel.repository.CategoryRepository;
import com.pfe.kounouz.travel.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository CategoryRepository;
	
	@Override
	public Category findOneCategory(Long id) {
		// TODO Auto-generated method stub
		return  CategoryRepository.findOnCategoryById(id);
	}

	@Override
	public List<Category> findAllCategory() {
		// TODO Auto-generated method stub
		return CategoryRepository.findAll();
	}

	@Override
	public Category saveCategory(Category Category) {
		// TODO Auto-generated method stub
		return CategoryRepository.save(Category);
	}

	@Override
	public void deleteCategory(Category Category) {
		CategoryRepository.delete(Category);
		
		
	}
	
	

}
