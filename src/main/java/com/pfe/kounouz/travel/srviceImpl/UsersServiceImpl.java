package com.pfe.kounouz.travel.srviceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pfe.kounouz.travel.entitie.Users;
import com.pfe.kounouz.travel.service.UsersService;
import com.pfe.kounouz.travel.repository.UsersRepository;

@Service
public class UsersServiceImpl  implements UsersService, UserDetailsService  {
	
	@Autowired
	UsersRepository  UsersRepository ;

	@Override
	public void deleteUsers(Users users) {
		 UsersRepository.delete(users);
		
	}

	@Override
	public List<Users> findAllUsers() {
		return UsersRepository.findAll();
	}

	@Override
	public Users findOneUsers(Long id) {
		return UsersRepository.findUsersById(id);
	}

	@Override
	public Users saveUsers(Users users) {
		return UsersRepository.save(users);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	 Optional<Users> user = UsersRepository.findByLogin(username);
		if(!user.isPresent()) {
			throw new UsernameNotFoundException(username);
		}
			Collection<GrantedAuthority> authorities = new ArrayList<>();
//			List<Profile> listProfil = profileService.findListProfilofUserLogin(username);
//			for (int i = 0; i < listProfil.size(); i++) {
//				authorities.add(new SimpleGrantedAuthority(listProfil.get(i).getId().getRoleId()));
//			}
			return new org.springframework.security.core.userdetails.User(user.get().getLogin(), user.get().getPassword(), authorities);
	}

	



}
