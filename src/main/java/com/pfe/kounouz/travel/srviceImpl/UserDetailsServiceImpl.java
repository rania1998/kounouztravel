package com.pfe.kounouz.travel.srviceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.esprit.consomit.entities.Users;
import com.esprit.consomit.repository.UsersRepository;



@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UsersRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Users> user = userRepository.findByLogin(username);
		if(!user.isPresent()) {
			throw new UsernameNotFoundException(username);
		}
		if(user.get().getAuthSourceId() != null && user.get().getAuthSourceId()==1) {
			Collection<GrantedAuthority> authorities = new ArrayList<>();
//			List<Profile> listProfil = profileService.findListProfilofUserLogin(username);
//			for (int i = 0; i < listProfil.size(); i++) {
//				authorities.add(new SimpleGrantedAuthority(listProfil.get(i).getId().getRoleId()));
//			}
			return new org.springframework.security.core.userdetails.User(user.get().getLogin(), user.get().getHashedPassword(), authorities);
		}
		return null;
	}

}
