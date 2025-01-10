package org.example.jdbc;

import java.util.List;

public interface PersonDAO {
    List<Person> findAll();
    Person findById(int id);
    Integer save (Person p);
    void delete(Person p);
    List<Integer> getIds();
}
