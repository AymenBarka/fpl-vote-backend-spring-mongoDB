package fpl.spring.jwt.mongodb.models;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sujets")
public class Sujet {
	@Id
	private String id;
	
	@Size(max = 50)
	private String titre;
	
	@Size(max = 50)
	private String description;
	
	@Size(max = 50)
	private String createdByUser;

	public Sujet() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedByUser() {
		return createdByUser;
	}

	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}

	@Override
	public String toString() {
		return "Sujet [id=" + id + ", titre=" + titre + ", description=" + description + ", createdByUser="
				+ createdByUser + "]";
	}
   
	
}
