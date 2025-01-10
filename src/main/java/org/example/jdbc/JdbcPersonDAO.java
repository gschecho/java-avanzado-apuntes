package org.example.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcPersonDAO implements PersonDAO {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/hr";
    private static final String USER ="usuario";
    private static final String PASSWORD =" password";


    // Load el Driver
    // Usa reflexion la clase llama a la clase.
    // cuando cargas el driver invoca un bloque estatico que instancia el Driver y invoca el metodo registerDriver en el DriverManager
    public JdbcPersonDAO(){
        try{
            Class.forName(DRIVER);
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }


    @Override
    public List<Person> findAll() {

        List<Person> people = new ArrayList<>();
        try(
                Connection con = DriverManager.getConnection(URL, USER,PASSWORD);
                PreparedStatement ps = con.prepareStatement("SELECT * FROM hr.people");
                ){
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                people.add(new Person(rs.getInt(1), rs.getString(2));
            }rs.close();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return people;
    }

    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public Integer save(Person p) {
        return null;
    }

    @Override
    public void delete(Person p) {

    }

    @Override
    public List<Integer> getIds() {
        return null;
    }
}
