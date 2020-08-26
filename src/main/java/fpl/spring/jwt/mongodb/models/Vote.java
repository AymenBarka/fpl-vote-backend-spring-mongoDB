package fpl.spring.jwt.mongodb.models;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "votes")
public class Vote {
	@Id
	private String id;
	
	@Size(max = 50)
	private String subnum;
	
	@Size(max = 50)
	private String id_user;
	
	
	@Size(max = 50)
	private String votedYes;
	
	@Size(max = 50)
	private String votedNo;

	public Vote() {
	}


	public String getSubnum() {
		return subnum;
	}


	public void setSubnum(String subnum) {
		this.subnum = subnum;
	}


	public String getVotedYes() {
		return votedYes;
	}

	public void setVotedYes(String votedYes) {
		this.votedYes = votedYes;
	}

	public String getVotedNo() {
		return votedNo;
	}

	public void setVotedNo(String votedNo) {
		this.votedNo = votedNo;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId_user() {
		return id_user;
	}

	public void setId_user(String id_user) {
		this.id_user = id_user;
	}

	@Override
	public String toString() {
		return "Vote [id=" + id + ", subnum=" + subnum + ", id_user=" + id_user + ", votedYes=" + votedYes
				+ ", votedNo=" + votedNo + "]";
	}
	
	
	
	
}
