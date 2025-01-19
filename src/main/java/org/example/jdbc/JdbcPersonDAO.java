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
/*
        List<Person> people = new ArrayList<>();
        try(
                Connection con = DriverManager.getConnection(URL, USER,PASSWORD);
                // createStatment o prepareStatment
                PreparedStatement ps = con.prepareStatement("SELECT * FROM hr.people");
                ){
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                people.add(new Person(rs.getInt(1), rs.getString(2)));
            }rs.close();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return people;
        */
        return null;
    }

    @Override
    public Person findById(int id) {

        /*
        Person p;

        try( Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        PreparedStatement ps =  conn.prepareStatement("SELECT * FROM hr WHERE id=?");){
            ps.setInt(1,10);
            ResultSet rs = ps.executeQuery();

if(rs.next()){
            return new Person(id, rs.getString(2) );
}else {
    System.out.printf("Resultado no encontrado con id= %d", id);
}
            rs.close();
        } catch (SQLException  ex){
            ex.printStackTrace();
        }
*/
        return null;
    }

    @Override
    public Integer save(Person p) {

        /*
        int generaredKey = 0;
        try(
                Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement ps =  conn.prepareStatement("INSERT INTO hr.people(name) values ('name'=?)", Statement.RETURN_GENERATED_KEYS);){

                ps.setString(1, p.getName());
                int r = ps.executeUpdate();

                if(r!= 1 ) throw new SQLException("No se añadieron filas");
                try(ResultSet keys = ps.getGeneratedKeys()){
                   if(keys.next()){;
                       generaredKey = keys.getInt(1);
                   }
                }


        }catch( SQLException ex){

        ex.printStackTrace();
    }

         */
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
