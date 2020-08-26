package fpl.spring.jwt.mongodb.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fpl.spring.jwt.mongodb.models.User;
import fpl.spring.jwt.mongodb.repository.UserRepository;
@Service
@Transactional
public class UserServiceImpl implements IServiceUser {
	
    @Autowired
	UserRepository userrepo;
	@Override
	public User getUsers(String id) {
		Optional <User> usr = userrepo.findById(id);
		return usr.get();
	}

}
