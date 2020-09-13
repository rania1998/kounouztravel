package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.WorkflowConfig;

public interface WorkflowConfigService {

	public WorkflowConfig findOneWorkflowConfig(Long id);

	public List<WorkflowConfig> findAllWorkflowConfig();

	public WorkflowConfig saveWorkflowConfig(WorkflowConfig WorkflowConfig);

	public void deleteWorkflowConfig(WorkflowConfig WorkflowConfig);

}
