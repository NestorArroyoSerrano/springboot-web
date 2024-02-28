package com.nestor.curso.springboot.webapp.springbootweb.controllers;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nestor.curso.springboot.webapp.springbootweb.models.User;
import com.nestor.curso.springboot.webapp.springbootweb.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping(path="/details")
    public UserDto details() {
        
        User user = new User("Néstor", "Arroyo");

        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Néstor", "Arroyo");
        User user2 = new User("Pepe", "Feo");
        User user3 = new User("Juan", "Feliz");
        
        List<User> users = Arrays.asList(user, user2, user3);

        //users.add(user);
       // users.add(user2);
      //  users.add(user3);

        return users;
    }


    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("Néstor", "Arroyo");
         
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);
        return body;
    }


}
