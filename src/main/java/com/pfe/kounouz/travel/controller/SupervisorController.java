package com.pfe.kounouz.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.kounouz.travel.service.SupervisorService;

import com.pfe.kounouz.travel.entitie.Supervisor;



@RequestMapping
@RestController
public class SupervisorController {

	@Autowired
	private SupervisorService  SupervisorService;

	@RequestMapping(value = "/Supervisor/SupervisorManager", method = RequestMethod.GET)
	public List<Supervisor> findAll() {
		return SupervisorService.findAllSupervisor();
	}

	@RequestMapping(value = "/Supervisor/SupervisorById/{id}", method = RequestMethod.GET)
	public Supervisor getSupervisorById(@PathVariable("id") Long id) {
		return SupervisorService.findOneSupervisor(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Supervisor/deleteSupervisor")
	public void deleteSupervisor(@RequestBody Supervisor  Supervisor) {
		SupervisorService.deleteSupervisor(Supervisor);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/Supervisor/saveSupervisor")
	public void saveSupervisor(@RequestBody Supervisor Supervisor) {
		SupervisorService.saveSupervisor(Supervisor);

	}
}
