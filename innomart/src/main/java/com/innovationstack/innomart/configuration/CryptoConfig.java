package com.innovationstack.innomart.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CryptoConfig implements WebMvcConfigurer{
	
	@Bean
	public BCryptPasswordEncoder securityEncryptor() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
		
	}

}
