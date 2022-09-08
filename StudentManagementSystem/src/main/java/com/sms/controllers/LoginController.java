package com.sms.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.User;
import com.sms.entity.UserRequest;
import com.sms.entity.UserResponse;
import com.sms.security.jwt.utils.JwtUtil;
import com.sms.service.IUserService;


@RequestMapping("/user")
@RestController
public class LoginController {
	@Autowired
	private IUserService userService;
	@Autowired
	private JwtUtil util;
	@Autowired
	private AuthenticationManager authenticationManager;

	@RequestMapping("/saveUser")
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		
		Integer id = userService.saveUser(user);
		String message= "User with id '"+id+"' saved succssfully!";
		//return new ResponseEntity<String>(message, HttpStatus.OK);
		return ResponseEntity.ok(message);
	} 
	
	@RequestMapping("/loginUser")
	public ResponseEntity<UserResponse> login(@RequestBody UserRequest request){
		
		//Validate username/password with DB(required in case of Stateless Authentication)
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
				request.getUsername(), request.getPassword()));
		String token =util.generateToken(request.getUsername());
		return ResponseEntity.ok(new UserResponse(token,"Token generated successfully!"));
	}
	
	@RequestMapping("/getData")
	public ResponseEntity<String> testAfterLogin(Principal p){
		return ResponseEntity.ok("You are accessing data after a valid Login. You are :" +p.getName());
	}
}

