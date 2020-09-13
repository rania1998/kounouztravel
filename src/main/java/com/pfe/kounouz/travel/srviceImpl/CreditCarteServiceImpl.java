package com.pfe.kounouz.travel.srviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pfe.kounouz.travel.entitie.CreditCarte;
import com.pfe.kounouz.travel.service.CreditCarteService;
import com.pfe.kounouz.travel.repository.CreditCarteRepository;
public class CreditCarteServiceImpl implements CreditCarteService{
	@Autowired
	CreditCarteRepository CreditCarteRepository ;

	@Override
	public void deleteCreditCarte(CreditCarte CreditCarte) {
		CreditCarteRepository.delete(CreditCarte);
		
	}

	@Override
	public List<CreditCarte> findAllCreditCarte() {
		// TODO Auto-generated method stub
		return CreditCarteRepository.findAll();
	}

	@Override
	public CreditCarte findOneCreditCarte(Long id) {
		
		return CreditCarteRepository.findCreditCarteById(id);
	}

	@Override
	public CreditCarte saveCreditCarte(CreditCarte CreditCarte) {
		
		return CreditCarteRepository.save(CreditCarte);
	}

}
