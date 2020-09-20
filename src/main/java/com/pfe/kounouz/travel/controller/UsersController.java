package com.pfe.kounouz.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.kounouz.travel.entitie.Users;
import com.pfe.kounouz.travel.service.UsersService;


@RequestMapping
@RestController
public class UsersController {
	@Autowired
	private UsersService  UsersService;
	
	@RequestMapping(value = "/Users/UsersManager", method = RequestMethod.GET)
	public List<Users> findAll() {
		return UsersService.findAllUsers();
	}

	@RequestMapping(value = "/Users/UsersById/{id}", method = RequestMethod.GET)
	public Users getUsersById(@PathVariable("id") Long id) {
		return UsersService.findOneUsers(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Users/deleteUsers")
	public void deleteUsers(@RequestBody Users Users) {
		UsersService.deleteUsers(Users);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/Users/saveUsers")
	public void saveUsers(@RequestBody Users Users) {
		UsersService.saveUsers(Users);
	}


}
