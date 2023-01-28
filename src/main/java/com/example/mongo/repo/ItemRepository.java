package com.example.mongo.repo;

import com.example.mongo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<User, String> {

}