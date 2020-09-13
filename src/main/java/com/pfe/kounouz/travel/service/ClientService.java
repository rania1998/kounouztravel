package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.Client;

public interface ClientService {

	public List<Client> findAllclient();

	public Client findOneclient(Long id);

	public void deleteclient(Client client);

	public Client saveClient(Client client);

}
