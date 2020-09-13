package com.pfe.kounouz.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.kounouz.travel.entitie.WorkflowConfig;

@Repository
public interface WorkflowConfigRepository extends JpaRepository<WorkflowConfig, Long> {
	WorkflowConfig findWorkflowConfigById(long id);
}
