package fpl.spring.jwt.mongodb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fpl.spring.jwt.mongodb.models.Sujet;
import fpl.spring.jwt.mongodb.security.services.IServiceSujet;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/sujet")
public class SujetController {
	
	@Autowired
	IServiceSujet serviceSujet;
	
	@PostMapping("/add-subject")
	public Sujet addSujet(@RequestBody Sujet sujet) {
		return serviceSujet.addSujet(sujet);
	}

	@GetMapping("/ListSubjects")
	public List<Sujet> getAllSujet() {
		return serviceSujet.getAllSujet();
	}
    @GetMapping("/getSubject/{id}")
	public Sujet getSujet(@PathVariable (value="id") String id) {
		return serviceSujet.getSujet(id);
	}

	public Sujet update(Sujet sujet) {
		return serviceSujet.update(sujet);
	}

}
