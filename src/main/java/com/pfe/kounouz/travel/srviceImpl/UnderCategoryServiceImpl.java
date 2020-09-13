package com.pfe.kounouz.travel.srviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.kounouz.travel.entitie.UnderCategory;
import com.pfe.kounouz.travel.service.UnderCategoryService;
import com.pfe.kounouz.travel.repository.UnderCategoryRepository;

@Service
public class UnderCategoryServiceImpl implements UnderCategoryService {
	
	@Autowired
	  
	UnderCategoryRepository UnderCategoryRepository;

	@Override
	public UnderCategory findOneUnderCategory(Long id) {
		// TODO Auto-generated method stub
		return UnderCategoryRepository.findUnderCategoryById(id);
	}

	@Override
	public List<UnderCategory> findAllUnderCategory() {
		// TODO Auto-generated method stub
		return UnderCategoryRepository.findAll();
	}

	@Override
	public UnderCategory saveUnderCategory(UnderCategory UnderCategory) {
		// TODO Auto-generated method stub
		return UnderCategoryRepository.save( UnderCategory);
	}

	@Override
	public void deleteUnderCategory(UnderCategory UnderCategory) {
		UnderCategoryRepository.delete(UnderCategory);
		
	}

}
