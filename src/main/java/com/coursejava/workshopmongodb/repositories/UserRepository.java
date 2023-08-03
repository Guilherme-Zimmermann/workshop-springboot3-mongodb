package com.coursejava.workshopmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.coursejava.workshopmongodb.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
