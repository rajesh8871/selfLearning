package com.demo.spring.mockito.springbootmockito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private String message;
    private Boolean status;
    private List<User> user;
}
