package com.pfe.kounouz.travel.srviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.kounouz.travel.entitie.Supervisor;
import  com.pfe.kounouz.travel.repository.SupervisorRepository;
import com.pfe.kounouz.travel.service.SupervisorService;

@Service
public class SupervisorServiceImpl implements SupervisorService {

	@Autowired
     SupervisorRepository SupervisorRepository ;

	@Override
	public Supervisor saveSupervisor(Supervisor Supervisor) {
		return  SupervisorRepository.save( Supervisor);
		
	}

	@Override
	public void deleteSupervisor(Supervisor Supervisor) {
		SupervisorRepository.delete(Supervisor);
		
	}

	@Override
	public List<Supervisor> findAllSupervisor() {
		return SupervisorRepository.findAll();
	}

	@Override
	public Supervisor findOneSupervisor(Long id) {
		return SupervisorRepository.findSupervisorById(id);
	}

	
}
