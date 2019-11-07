package com.alpi.controller;

import com.alpi.entities.Person;
import com.alpi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
