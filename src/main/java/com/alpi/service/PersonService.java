package com.alpi.service;

import com.alpi.dao.PersonDao;
import com.alpi.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public List<Person> listAll() {
        return personDao.findAll();
    }
}
