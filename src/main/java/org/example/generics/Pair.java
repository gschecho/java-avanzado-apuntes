package org.example.generics;

public class Pair <T>{

    T first;
    T second;
    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    };

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    // Para utilizar este metodo el valor se tiene que guardar en un nuevo objeto Pair.
    public Pair<T> swap(){
        return  new Pair<T>(second, first);
    }

    //Esto nos dice que será un objeto T <T>
    // Este metodo se llama desde la clase Pair
    public static <T> void swap(Pair<T> pair){

        T temp = pair.first;
        pair.first = pair.second;
        pair.second = temp;
    }
}
