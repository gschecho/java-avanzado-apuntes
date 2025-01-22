package org.example.innerclasses;

import java.util.Arrays;
import java.util.List;

public class SortStringsDemo {
    public static void main(String[] args) {

        StringSorter ss = new StringSorter();

        List<String> lista = Arrays.asList("Una", "lista", "de", "strings");


        ss.setStrings(lista);

        System.out.println("Antes de ordenar");
        System.out.println(lista);
        System.out.println("Despues de ordenar");
        System.out.println(ss.lenghtSort());
        System.out.println(lista);

    }
}
