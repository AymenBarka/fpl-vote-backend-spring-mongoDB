package fpl.spring.jwt.mongodb.security.services;

import fpl.spring.jwt.mongodb.models.User;

public interface IServiceUser {
	public User getUsers(String id);


}
