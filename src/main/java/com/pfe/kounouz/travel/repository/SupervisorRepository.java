package com.pfe.kounouz.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.kounouz.travel.entitie.Supervisor;

@Repository
public interface SupervisorRepository extends JpaRepository<Supervisor, Long> {
	Supervisor findSupervisorById(long id);

}
