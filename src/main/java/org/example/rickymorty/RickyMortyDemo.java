package org.example.rickymorty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RickyMortyDemo {
    public static void main(String ... args){
        RickyMorty personaje = new RickyMorty();

        List<String> personajes = new ArrayList<>();
        personajes.add("1");




        System.out.println( personaje.getData(personajes));


        System.out.println("PETICION 2");
        personaje.fillInLatLng(1);
    }
}
