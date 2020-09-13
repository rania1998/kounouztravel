package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.Agents;

public interface AgentsService {

	public Agents findOneAgents(Long id);

	public List<Agents> findAllAgents();

	public Agents saveAgents(Agents agent);

	public void deleteAgents(Agents agent);
}
