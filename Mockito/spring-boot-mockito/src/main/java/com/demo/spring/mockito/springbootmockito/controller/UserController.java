package com.demo.spring.mockito.springbootmockito.controller;

import com.demo.spring.mockito.springbootmockito.model.Response;
import com.demo.spring.mockito.springbootmockito.model.User;
import com.demo.spring.mockito.springbootmockito.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User/")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PostMapping("/addUser")
    public Response addEmployee(@RequestBody User user) {
        userService.addUser(user);
        return new Response(user.getId() + " inserted", Boolean.TRUE, null);
    }

    @GetMapping("/findAllUser")
    public Response findAllUsers() {
        userService.getAllUsers();
        return new Response(String.valueOf(userService.getAllUsers().size()),
                Boolean.TRUE, userService.getAllUsers());
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody User user) {
        userService.deleteUser(user);
    }

    @GetMapping("/findByAddress")
    public List<User> findUserByAddress(@PathVariable String address) {
        return userService.findUserByAddress(address);
    }

}
