package com.demo.spring.mockito.springbootmockito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "user")
public class User {

    @Id
    private int id;
    private String name;
    private int age;
    private String address;
}
