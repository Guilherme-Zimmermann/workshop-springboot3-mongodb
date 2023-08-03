package com.coursejava.workshopmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.coursejava.workshopmongodb.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
