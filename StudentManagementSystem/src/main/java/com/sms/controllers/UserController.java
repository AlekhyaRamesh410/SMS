package com.sms.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/sms")
@RestController("UserController")
	public class UserController {

		
		@RequestMapping(value="/getUsers" )
		public void getUsers(HttpServletRequest request,
				HttpServletResponse response) throws IOException {
			PrintWriter pw=response.getWriter();
			pw.append("Welcome to users list");
			System.out.println("welcome");
		}
}
