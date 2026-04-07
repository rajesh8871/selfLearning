package com.demo.spring.mockito.springbootmockito.service;

import com.demo.spring.mockito.springbootmockito.dao.UserRepository;
import com.demo.spring.mockito.springbootmockito.model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<User> findUserByAddress(String address) {
        return userRepository.findByAddress(address);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

}
