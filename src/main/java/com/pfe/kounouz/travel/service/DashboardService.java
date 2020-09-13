package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.Dashboard;

public interface DashboardService {
	public void deleteDashboard(Dashboard Dashboard);

	public List<Dashboard> findAllDashboard();

	public Dashboard findOneDashboard(Long id);

	public Dashboard saveDashboard(Dashboard Dashboard);
}
