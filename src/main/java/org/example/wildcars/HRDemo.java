package org.example.wildcars;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HRDemo {
    public static void main(String ... args){

        List<Employee> employees= Arrays.asList(new Employee("Juan"), new Employee("José"), new Employee("Pedro"));

        List<Salaried> salarieds= Arrays.asList(new Salaried("MartínS"), new Salaried("AndrésS"), new Salaried("AlfonsoS"));

        HR.printEmpNames(employees);
        // Por más que salarieds sea hijo de Employee no se puede imprimir si utilizamos como llamada a su padre
        // No compila
        //HR.printEmpNames(salarieds);
        //salarieds.add(new Employee("Armando"));

        // En cambio si utilizamos el generic con el wildcard ?  y extendemos de Employee osea el padre conseguimos poder imprimir la lista
        HR.printEmployeeAndSubclass(salarieds);

        System.out.println("FILTRADO PARES");
        //El Predicates recibe un metodo lambda
        HR.printAllFiltered(employees, (e)-> e.toString().length() %2 ==0 );
    }
}
