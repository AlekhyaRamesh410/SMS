package com.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.entity.Clients;
import com.sms.entity.User;

public interface ClientRepository extends JpaRepository<Clients, Integer>{

	
	
}
