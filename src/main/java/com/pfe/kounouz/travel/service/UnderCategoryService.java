package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.UnderCategory;

public interface UnderCategoryService {
	public UnderCategory findOneUnderCategory(Long id);

	public List<UnderCategory> findAllUnderCategory();

	public UnderCategory saveUnderCategory(UnderCategory UnderCategory);

	public void deleteUnderCategory(UnderCategory UnderCategory);

}
