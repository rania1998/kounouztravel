package com.pfe.kounouz.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.kounouz.travel.service.AgentsService;

import com.pfe.kounouz.travel.entitie.Agents;

@RequestMapping
@RestController
public class AgentsController {

	@Autowired
	private AgentsService  AgentsService;

	@RequestMapping(value = "/Agents/AgentsManager", method = RequestMethod.GET)
	public List<Agents> findAll() {
		return AgentsService.findAllAgents();
	}

	@RequestMapping(value = "/Agents/AgentsById/{id}", method = RequestMethod.GET)
	public Agents getAgentsById(@PathVariable("id") Long id) {
		return AgentsService.findOneAgents(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Agents/deleteAgents")
	public void deleteAgents(@RequestBody Agents Agents) {
		AgentsService.deleteAgents(Agents);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/Agent/saveAgent")
	public void saveAgent(@RequestBody Agents Agent) {
		AgentsService.saveAgents(Agent);

	}
	
	
}
