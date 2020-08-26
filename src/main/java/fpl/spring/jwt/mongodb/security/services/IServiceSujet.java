package fpl.spring.jwt.mongodb.security.services;

import java.util.List;

import fpl.spring.jwt.mongodb.models.Sujet;

public interface IServiceSujet {

	public Sujet addSujet(Sujet sujet);
	
	public List<Sujet> getAllSujet();
	
	public Sujet getSujet(String id);
	
	public Sujet update(Sujet sujet);
}
