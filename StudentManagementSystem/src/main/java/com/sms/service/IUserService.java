package com.sms.service;

import java.util.Optional;

import com.sms.entity.User;

public interface IUserService {
    Integer saveUser(User user);
	
	Optional<User> findByUsername(String username);
}
