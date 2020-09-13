package com.pfe.kounouz.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pfe.kounouz.travel.entitie.CreditCarte;
import com.pfe.kounouz.travel.service.CreditCarteService;

public class CreditCarteController {
	
	@Autowired
	private CreditCarteService CreditCarteService;

	@RequestMapping(value = "/CreditCarte/CreditCarteManager", method = RequestMethod.GET)
	public List<CreditCarte> findAll() {
		return CreditCarteService.findAllCreditCarte();
	}

	@RequestMapping(value = "/CreditCarte/CreditCarteById/{id}", method = RequestMethod.GET)
	public CreditCarte getCreditCarteById(@PathVariable("id") Long id) {
		return CreditCarteService.findOneCreditCarte(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/CreditCarte/deleteCreditCarte")
	public void deleteCreditCarte(@RequestBody CreditCarte CreditCarte) {
		CreditCarteService.deleteCreditCarte(CreditCarte);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/CreditCarte/saveCreditCarte")
	public void saveCreditCarte(@RequestBody CreditCarte CreditCarte) {
		CreditCarteService.saveCreditCarte(CreditCarte);

	}

}
