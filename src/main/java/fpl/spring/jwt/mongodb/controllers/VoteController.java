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

import fpl.spring.jwt.mongodb.models.Vote;
import fpl.spring.jwt.mongodb.security.services.IServiceVote;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/vote")
public class VoteController {
	
    @Autowired
	IServiceVote servicevote;

    @PostMapping("/add")
	public Vote addVote(@RequestBody Vote vote) {
		return servicevote.addVote(vote);
	}

	public List<Vote> getAllVote(Vote vote) {
		return servicevote.getAllVote(vote);
	}

	
	@GetMapping("listVoteSubject/{id}")
	public List<Vote> getVoteBySubject(@PathVariable(value="id") String id) {
		return servicevote.getVoteBySubject(id);
	}

	public Vote update(Vote vote) {
		return servicevote.update(vote);
	}
    
    
}
