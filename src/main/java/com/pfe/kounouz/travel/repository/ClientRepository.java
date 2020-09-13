package com.pfe.kounouz.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.kounouz.travel.entitie.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	Client findClientById(Long id);

}
