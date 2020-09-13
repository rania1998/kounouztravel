package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.Users;

public interface UsersService {

	public void deleteUsers(Users users);

	public List<Users> findAllUsers();

	public Users findOneUsers(Long id);

	public Users saveUsers(Users users);

}
