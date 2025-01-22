package org.example.Streams;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {


    public static  void main(String ... args){
        //List.of = Java 9
        // Arrays.asList soporta nulos - List.of no lo hace
        List<String> lista = List.of("Hola", "mundo", "curel");
        List<String> lista2 =  Arrays.asList("Hola", "mundo", "curel");

        String busqueda = "mun";
        String resultado = lista.stream()
                .filter(elemento -> elemento.contains(busqueda))
                .findFirst().get();


        System.out.println(resultado);
    }




}
