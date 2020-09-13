package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.ProcessInstance;

public interface ProcessInstanceService {

	public ProcessInstance findOneProcessInstance(Long id);

	public List<ProcessInstance> findAllProcessInstance();

	public ProcessInstance saveProcessInstance(ProcessInstance ProcessInstance);

	public void deleteProcessInstance(ProcessInstance ProcessInstance);

}
