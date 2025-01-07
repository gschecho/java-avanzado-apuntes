package org.example.clasesAbstractas;

import java.time.LocalDate;

public abstract class EmpleadoA {

    private static final String DEFAULT_NAME = "UNKNOWN";

    private static int id;
    String name;
    LocalDate date = LocalDate.now();

    public EmpleadoA(){
        this(DEFAULT_NAME);
    }

    public EmpleadoA(String name){
        id = id++;
        this.name = name;
    }


    public abstract void pagarSueldo();


}
