package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.Supervisor;

public interface SupervisorService {

	public Supervisor saveSupervisor(Supervisor Supervisor);

	public void deleteSupervisor(Supervisor Supervisor);

	public List<Supervisor> findAllSupervisor();

	public Supervisor findOneSupervisor(Long id);

}
