package com.pfe.kounouz.travel.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.kounouz.travel.data.LoginRequest;
import com.pfe.kounouz.travel.data.LoginResponse;
import com.pfe.kounouz.travel.exception.BadRequestException;
import com.pfe.kounouz.travel.security.JWTAuthorizationFilter;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

	

@RestController
@RequestMapping(value = "/auth")
@CrossOrigin
public class AuthController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<LoginResponse> authenticateUser(@RequestBody LoginRequest loginRequest) {
		try {
			if (loginRequest.getLogin().isEmpty() || loginRequest.getPassword().isEmpty()) {
				throw new BadRequestException("MISSING_REQUIRED_DATA_LOGIN_PASSWORD");
			}

			String jwt = null;
				Authentication authentication = authenticationManager.authenticate(
						new UsernamePasswordAuthenticationToken(loginRequest.getLogin(), loginRequest.getPassword()));
				User userPrincipal =(User) authentication.getPrincipal();

				jwt = Jwts.builder().setSubject(userPrincipal.getUsername()).setIssuedAt(new Date())
						.setExpiration(new Date(System.currentTimeMillis() + 864_000_000))
						.signWith(SignatureAlgorithm.HS256, JWTAuthorizationFilter.SECRET).claim("roles", userPrincipal.getAuthorities()).compact();
				LoginResponse response = new LoginResponse();
				response.setJwt(jwt);
			return new ResponseEntity<LoginResponse>(response, HttpStatus.OK);
		} catch (AuthenticationException e) {
			throw new BadRequestException("AUTHENTICATION_FAILED");
		}
	}

}
