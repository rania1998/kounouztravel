package com.pfe.kounouz.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.kounouz.travel.entitie.ProcessInstance;

@Repository
public interface ProcessInstanceRepository extends JpaRepository<ProcessInstance, Long> {

	ProcessInstance findProcessInstanceById(long id);
}
