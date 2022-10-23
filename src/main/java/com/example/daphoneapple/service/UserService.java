package com.example.daphoneapple.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface UserService  {
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}