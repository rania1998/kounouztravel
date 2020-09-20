package com.pfe.kounouz.travel.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordEncoderConfig {

	@SuppressWarnings("deprecation")
	@Bean
	public PasswordEncoder getBCPE() {
		return NoOpPasswordEncoder.getInstance();
	}
}
