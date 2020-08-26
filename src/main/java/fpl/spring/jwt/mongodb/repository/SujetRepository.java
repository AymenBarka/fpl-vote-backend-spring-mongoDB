package fpl.spring.jwt.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import fpl.spring.jwt.mongodb.models.Sujet;

public interface SujetRepository extends MongoRepository<Sujet, String> {

}
