package com.pfe.kounouz.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.kounouz.travel.entitie.WorkflowConfig;
import com.pfe.kounouz.travel.service.WorkflowConfigService;

@RequestMapping
@RestController
public class WorkflowConfigcontroller {
	
	@Autowired
	private WorkflowConfigService WorkflowConfigService;
	
	@RequestMapping(value = "/WorkflowConfig/WorkflowConfigManager", method = RequestMethod.GET)
	public List<WorkflowConfig> findAll() {
		return WorkflowConfigService.findAllWorkflowConfig();
	}

	@RequestMapping(value = "/WorkflowConfig/WorkflowConfigById/{id}", method = RequestMethod.GET)
	public WorkflowConfig getWorkflowConfigById(@PathVariable("id") Long id) {
		return WorkflowConfigService.findOneWorkflowConfig (id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/WorkflowConfig/deleteWorkflowConfig ")
	public void deleteWorkflowConfig (@RequestBody WorkflowConfig  WorkflowConfig ) {
		WorkflowConfigService.deleteWorkflowConfig (WorkflowConfig);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/WorkflowConfig/saveWorkflowConfig")
	public void saveWorkflowConfig (@RequestBody WorkflowConfig  WorkflowConfig) {
		WorkflowConfigService.saveWorkflowConfig(WorkflowConfig );}

}
	
	


