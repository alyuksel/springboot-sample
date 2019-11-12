package com.alpi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class GenericDao<T> {

    @Autowired
    private EntityManager em;

    public List<T> findAll(Class<T> clazz) {
        return em.createQuery("from person", clazz).getResultList();

    }
}
