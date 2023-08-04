package com.otekin.dev.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.otekin.dev.demo.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
