package com.example.daphoneapple.auth;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.daphoneapple.common.CommonUtils;
import com.example.daphoneapple.entity.User;
import com.example.daphoneapple.model.LoginRequest;
import com.example.daphoneapple.service.UserService;

@RestController
@RequestMapping(path = "/api/authenticate")
public class AutheticateController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CommonUtils commonUtils;
	@Autowired
	AuthenticationManager authenticationManager;

	@PostMapping(value = "/login")
	public ResponseEntity<LoginResponse> loginAdmin(@RequestBody LoginRequest loginRequest,
			HttpServletResponse response) {
		String auth;
		LoginResponse loginResponse = new LoginResponse();
		try {
			auth = commonUtils.createToken(loginRequest.getUsername(), loginRequest.getPassword(), "1");
			Authentication authentication = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
			SecurityContextHolder.getContext().setAuthentication(authentication);
			User user = (User) authentication.getPrincipal();
			List<String> permissions = new ArrayList<>();
			for (GrantedAuthority role : user.getAuthorities()) {
				permissions.add(role.getAuthority());
			}
			UserDetail userDetail = new UserDetail();
			userDetail.setTokenId(auth);
			userDetail.setUsername(user.getUsername());
			userDetail.setId(user.getId());
			userDetail.setPermissions(permissions);

			loginResponse.setUserDetail(userDetail);
			loginResponse.setAuthorization(auth);
			loginResponse.setAuthenticated(true);

			if (loginRequest.getRemember() != null && loginRequest.getRemember() == true) {
				Cookie myCookie = new Cookie("COOKIEID", auth);
				response.addCookie(myCookie);
			}
		} catch (Exception e) {
			return new ResponseEntity<LoginResponse>(new LoginResponse("00", "Error"), HttpStatus.OK);
		}
		return new ResponseEntity<LoginResponse>(loginResponse, HttpStatus.OK);
//		}
//		return new ResponseEntity<LoginResponse>(new LoginResponse("false", ""), HttpStatus.OK);

	}

//	@PostMapping(value = "/user/login")
//	public ResponseEntity<LoginResponse> loginUser(@RequestBody LoginRequest loginRequest) {
//		if (userService.loginUser(loginRequest) != CommonUtils.LOGIN_FAIL) {
//		String auth;
//		try {
//			auth = commonUtils.createToken(loginRequest.getUsername(), loginRequest.getPassword(), "0");
//		Authentication authentication = authenticationManager.authenticate(
//					new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
//			SecurityContextHolder.getContext().setAuthentication(authentication);
//			UserDetails userDetails = (UserDetails) authentication.getPrincipal();

//			userDetails.getAuthorities();
//				final UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user, null, grantedAuthorityList);
//				if(authentication!= null) {
//					UserDetails userDetails =  (UserDetails) authentication.getPrincipal();
//					System.out.println(userDetails.getAuthorities());
//					if(userDetails != null) {
//						
//					}
//				}
//		} catch (Exception e) {
//			return new ResponseEntity<LoginResponse>(new LoginResponse("false", ""), HttpStatus.OK);
//		}
//		return new ResponseEntity<LoginResponse>(new LoginResponse(auth, loginRequest.getUsername()), HttpStatus.OK);
//		}
//		return new ResponseEntity<LoginResponse>(new LoginResponse("false", ""), HttpStatus.OK);

//	}
}
