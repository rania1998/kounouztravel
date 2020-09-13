package com.pfe.kounouz.travel.srviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.kounouz.travel.entitie.Client;
import com.pfe.kounouz.travel.repository.ClientRepository;
import com.pfe.kounouz.travel.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
    ClientRepository ClientRepository ;

	@Override
	public List<Client> findAllclient() {
		return ClientRepository.findAll();
	}

	@Override
	public Client findOneclient(Long id) {
		return ClientRepository.findClientById(id);
	}

	@Override
	public void deleteclient(Client client) {
		ClientRepository.delete(client);
		
	}

	@Override
	public Client saveClient(Client client) {
		return ClientRepository.save(client);
	}
	
	

}
