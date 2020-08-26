package fpl.spring.jwt.mongodb.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fpl.spring.jwt.mongodb.models.Sujet;
import fpl.spring.jwt.mongodb.repository.SujetRepository;

@Service
@Transactional
public class ServiceSujetImpl implements IServiceSujet {
	
	  @Autowired
      SujetRepository sujetrepository;
	  
	@Override
	public Sujet addSujet(Sujet sujet) {
		return sujetrepository.save(sujet);
	}

	@Override
	public List<Sujet> getAllSujet() {
		return sujetrepository.findAll();
	}

	@Override
	public Sujet getSujet(String id) {
		return sujetrepository.findById(id).get();
	}

	@Override
	public Sujet update(Sujet sujet) {
		// TODO Auto-generated method stub
		return null;
	}

}
