package com.sms.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUsername(String username);
}
