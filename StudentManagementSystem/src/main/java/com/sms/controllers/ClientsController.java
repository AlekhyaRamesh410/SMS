package com.sms.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.Clients;
import com.sms.repo.ClientRepository;
@CrossOrigin(origins="/**")
@RequestMapping("/clients")
@RestController("ClientsController")
public class ClientsController {

	@Autowired
	private ClientRepository clientRepo;
	
	@GetMapping("/getAllClients")
	public List<Clients> getAllCleints(){
		return clientRepo.findAll();
		
	}
	@RequestMapping("/createClients")
	public String createClients(@RequestBody Clients clint){
		Clients i=clientRepo.save(clint);
		return "client "+i+"created successfully";
		
	}
	
}
