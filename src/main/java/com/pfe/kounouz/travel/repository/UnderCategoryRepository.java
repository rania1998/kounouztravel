package com.pfe.kounouz.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.kounouz.travel.entitie.UnderCategory;

@Repository
public interface UnderCategoryRepository extends JpaRepository<UnderCategory, Long> {
	UnderCategory findUnderCategoryById(long id);
}
