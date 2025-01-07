package org.example.wildcars;

import java.util.List;
import java.util.function.Predicate;

public class HR {
    public static void printEmpNames(List<Employee> employees){
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }


    // Utilizamos extends para imprimir  cualquier cosa que decienda o que extienda de Employee
    // Los salaried que decienden de Employee se imprimiran
    public static void printEmployeeAndSubclass(List<? extends Employee> employees){
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

        // No podemos añadir a la lista nuevos empleados desde este metodo,
    }


    //PECS Productores extienden, consumidoressuper
    public static void printAllFiltered(List<? extends Employee> employees, Predicate<? super  Employee> predicate){
        for (Employee e : employees){
            if(predicate.test(e)){
                System.out.println(e.getName());
            }
        }
    }

}
