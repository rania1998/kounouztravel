package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.CreditCarte;

public interface CreditCarteService {
	public void deleteCreditCarte(CreditCarte CreditCarte);

	public List<CreditCarte> findAllCreditCarte();

	public CreditCarte findOneCreditCarte(Long id);

	public CreditCarte saveCreditCarte(CreditCarte CreditCarte);

}
