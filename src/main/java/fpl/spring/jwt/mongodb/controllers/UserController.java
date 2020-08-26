package fpl.spring.jwt.mongodb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fpl.spring.jwt.mongodb.models.User;
import fpl.spring.jwt.mongodb.security.services.IServiceUser;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")

public class UserController {
	
	@Autowired
	IServiceUser userservice;
	
	@GetMapping("getOne/{id}")
	public User getUsers(@PathVariable(value = "id") String id) {
		User usr = userservice.getUsers(id);
		return usr;
	}
}
