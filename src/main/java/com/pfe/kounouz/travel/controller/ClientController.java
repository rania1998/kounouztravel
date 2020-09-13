package com.pfe.kounouz.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.kounouz.travel.entitie.Client;
import com.pfe.kounouz.travel.service.ClientService;


@RequestMapping
@RestController
public class ClientController {

	@Autowired
	private ClientService  ClientService;

	@RequestMapping(value = "/Client/ClientManager", method = RequestMethod.GET)
	public List<Client> findAll() {
		return ClientService.findAllclient();
	}

	@RequestMapping(value = "/Client/ClientById/{id}", method = RequestMethod.GET)
	public Client getClientById(@PathVariable("id") Long id) {
		return ClientService.findOneclient(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Agent/deleteClient")
	public void deleteClient(@RequestBody Client Client) {
		ClientService.deleteclient(Client);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/Client/saveClient")
	public void saveClient(@RequestBody Client Client) {
		ClientService.saveClient(Client);

	}

}
