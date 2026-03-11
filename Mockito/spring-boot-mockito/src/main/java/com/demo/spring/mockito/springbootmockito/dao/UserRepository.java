package com.demo.spring.mockito.springbootmockito.dao;

import com.demo.spring.mockito.springbootmockito.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, Integer> {
    List<User> findByAddress(String address);
}
