package com.innovationstack.innomart.auth.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.innovationstack.innomart.auth.AuthUser;

public interface CustomUserAuthService extends UserDetailsService{


	AuthUser loadUserByAccessToken(String authToken);
}

