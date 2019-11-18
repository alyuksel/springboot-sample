package com.alpi.controller;

import com.alpi.entities.Person;
import com.alpi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MyController {
    private final PersonService bookService;

    @Autowired
    public MyController(PersonService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> greeting() {
        return bookService.listAll();

    }

    @PostMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person saveUser(@RequestBody Map<String, String> body) {
        return bookService.saveUser(body.get("name"));
    }
}
