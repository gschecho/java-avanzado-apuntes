package org.example.jpa;

import jakarta.persistence.*;

// IMPORTANTE EL ARCHIVO JPA ESTA EN RESOURCES BAJO LA CARPETA META_INF/persistence.xml DEBE SER ESE EL NOMBRE
@Entity
@Table(name = "people")
public class Person {
    private static final String DEFAULT_NAME = "UNKNOWN";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;


    public Person() {
        this(DEFAULT_NAME);
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
/*

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        org.example.jdbc.Person person = (org.example.jdbc.Person) o;

        //Si el id no es igual al del person retorna falso
        if(!id.equals(person.id)) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {

        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
*/

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
