package com.pfe.kounouz.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pfe.kounouz.travel.entitie.Users;

@Repository
public interface UsersRepository extends JpaRepository <Users , Long>{	
	Users findUsersById(long id);
}
