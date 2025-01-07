package org.example.generics;

public class Tuple <T,U>{
    private T primero;
    private U segundo;


    public Tuple() {
    }



    public Tuple(T primero, U segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "primero=" + primero +
                ", segundo=" + segundo +
                '}';
    }
}
