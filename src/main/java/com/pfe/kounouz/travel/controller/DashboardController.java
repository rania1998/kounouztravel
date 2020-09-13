package com.pfe.kounouz.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.kounouz.travel.entitie.Dashboard;
import com.pfe.kounouz.travel.service.DashboardService;

@RequestMapping
@RestController
public class DashboardController {
	
	@Autowired
	private DashboardService DashboardService ;
	
	@RequestMapping(value = "/Dashboard/DashboardManager", method = RequestMethod.GET)
	public List<Dashboard> findAll() {
		return DashboardService.findAllDashboard();
	}

	@RequestMapping(value = "/Dashboard/DashboardById/{id}", method = RequestMethod.GET)
	public Dashboard getDashboardById(@PathVariable("id") Long id) {
		return DashboardService.findOneDashboard(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Dashboard/deleteDashboard")
	public void deleteDashboard(@RequestBody Dashboard Dashboard) {
		DashboardService.deleteDashboard(Dashboard);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/Dashboard/saveDashboard")
	public void saveDashboard(@RequestBody Dashboard Dashboard) {
		DashboardService.saveDashboard(Dashboard);}

}
	


