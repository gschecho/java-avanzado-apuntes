package org.example.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aritmetic {

    public static void main(String ... args)  {


        int x =3;
        int y =0;
        double z =0;

        try{
            z=x/y;
        } catch (ArithmeticException e){
            System.err.println(e);
        }

        // Puso las excepciones en el main
        try {
            Aritmetic.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        //El multicatch solo se puede hacer con excepciones hermanas no con padres/ hijos.


        //El try con recursos a de instanciar una clase con autoclosable.
        Path dir = Paths.get("src", "main","java","org","example","exception");
        try(BufferedReader br = Files.newBufferedReader(dir.resolve("Aritmetic.java"))){
            System.out.println("LINEA: " + br.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }



    }

}