package org.example.clasesAbstractas;

import java.text.NumberFormat;
import java.util.Locale;

public class Sueldo extends EmpleadoA{

    public static double DEFAULT_SALARY = 45000;

    NumberFormat nf = NumberFormat.getCurrencyInstance();

    private double salary;

    public Sueldo(){
        super();
    }

    public Sueldo(double salary) {
        this.salary = salary;
    }

    @Override
    public void pagarSueldo(){
            System.out.println("salario, "+ salary);

    }
}
