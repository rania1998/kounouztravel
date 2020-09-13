package com.pfe.kounouz.travel.srviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.kounouz.travel.entitie.Agents;
import com.pfe.kounouz.travel.repository.AgentsRepository;
import com.pfe.kounouz.travel.service.AgentsService;

@Service
public class AgentsServiceImpl implements AgentsService{
	@Autowired
	AgentsRepository AgentsRepository;

	@Override
	public Agents findOneAgents(Long id) {
		return AgentsRepository.findOneAgentById(id);
	}

	@Override
	public List<Agents> findAllAgents() {
		return AgentsRepository.findAll();
	}

	@Override
	public Agents saveAgents(Agents agents) {
		return AgentsRepository.save(agents);
	}

	@Override
	public void deleteAgents(Agents agents) {
		AgentsRepository.delete(agents);
	}
}
