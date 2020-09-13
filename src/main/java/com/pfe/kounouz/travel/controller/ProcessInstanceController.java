package com.pfe.kounouz.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.kounouz.travel.entitie.ProcessInstance;
import com.pfe.kounouz.travel.service.ProcessInstanceService;


@RequestMapping
@RestController
public class ProcessInstanceController {
	@Autowired
	private ProcessInstanceService  ProcessInstanceService;
	

	@RequestMapping(value = "/ProcessInstance/ProcessInstanceManager", method = RequestMethod.GET)
	public List<ProcessInstance> findAll() {
		return ProcessInstanceService.findAllProcessInstance();
	}

	@RequestMapping(value = "/ProcessInstance/ProcessInstanceById/{id}", method = RequestMethod.GET)
	public ProcessInstance getProcessInstanceById(@PathVariable("id") Long id) {
		return ProcessInstanceService.findOneProcessInstance(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/ProcessInstance/deleteProcessInstance")
	public void deleteProcessInstance(@RequestBody ProcessInstance ProcessInstance) {
		ProcessInstanceService.deleteProcessInstance(ProcessInstance);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/ProcessInstance/saveProcessInstance")
	public void savev(@RequestBody ProcessInstance ProcessInstance) {
		ProcessInstanceService.saveProcessInstance(ProcessInstance);


}}
