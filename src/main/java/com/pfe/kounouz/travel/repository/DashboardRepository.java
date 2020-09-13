package com.pfe.kounouz.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.kounouz.travel.entitie.Dashboard;

@Repository
public interface DashboardRepository extends JpaRepository<Dashboard, Long> {
	Dashboard findDashboardById(long id);

}
