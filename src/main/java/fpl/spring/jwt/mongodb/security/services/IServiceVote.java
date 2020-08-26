package fpl.spring.jwt.mongodb.security.services;

import java.util.List;

import fpl.spring.jwt.mongodb.models.Sujet;
import fpl.spring.jwt.mongodb.models.Vote;

public interface IServiceVote {
	
public Vote addVote(Vote vote);
	
	public List<Vote> getAllVote(Vote vote);
	
	public List <Vote> getVoteBySubject(String subnum);
	
	public Vote update(Vote vote);
}
