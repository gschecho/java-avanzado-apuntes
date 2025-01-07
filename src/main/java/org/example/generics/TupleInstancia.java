package org.example.generics;

public class TupleInstancia {

    public static void main(String ... args){

        Tuple<Integer, String> llaveValor = new Tuple<>(1, "primero");
        Tuple<String, String> llaveValorStrings = new Tuple<>("String uno", "String dos");


        System.out.println(llaveValor);
        System.out.println(llaveValorStrings);
    }
}
