package org.example.jpa;

import org.example.jdbc.Person;

import java.util.List;

public interface IJpaPersonDAO {
    List<org.example.jdbc.Person> findAll();
    org.example.jdbc.Person findById(int id);
    Integer save (org.example.jdbc.Person p);
    void delete(Person p);
    List<Integer> getIds();
}
