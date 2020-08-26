package fpl.spring.jwt.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import fpl.spring.jwt.mongodb.models.Vote;

public interface VoteRepository extends MongoRepository<Vote, String> {
	
	 List<Vote> findBySubnum(String subnum);
	 
}
