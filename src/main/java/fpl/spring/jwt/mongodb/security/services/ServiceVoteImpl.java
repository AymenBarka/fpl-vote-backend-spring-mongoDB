package fpl.spring.jwt.mongodb.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fpl.spring.jwt.mongodb.models.Vote;
import fpl.spring.jwt.mongodb.repository.VoteRepository;

@Service
@Transactional
public class ServiceVoteImpl implements IServiceVote {
	@Autowired
    VoteRepository voterepo;

	@Override
	public Vote addVote(Vote vote) {
		// TODO Auto-generated method stub
		return voterepo.save(vote);
	}

	@Override
	public List<Vote> getAllVote(Vote vote) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vote> getVoteBySubject(String id) {		
		return voterepo.findBySubnum(id);
	}

	@Override
	public Vote update(Vote vote) {
		// TODO Auto-generated method stub
		return null;
	}
}
