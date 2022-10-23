package com.example.daphoneapple.entity;

import lombok.*;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "USERS")
public class User implements UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(name = "Username", unique = true)
	private String username;

	private String password;
	
	@Column(unique = true)
	private String email;
	
	
	private String address;
	@Column(unique = true)
	
	private Integer phoneNumber;
	
	private Boolean gender;
	
	private String fullName;
	
	private Boolean status;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<UserRole> userRoles;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Order> list = new java.util.ArrayList<>();

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<GrantedAuthority> authorities = new HashSet<>();
		for (UserRole role : userRoles) {
			authorities.add(new SimpleGrantedAuthority(role.getRole().getName()));
		}
		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return this.status;
	}
}