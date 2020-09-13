package com.pfe.kounouz.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfe.kounouz.travel.entitie.CreditCarte;

public interface CreditCarteRepository extends JpaRepository<CreditCarte , Long> {
	CreditCarte findCreditCarteById(long id);

}
