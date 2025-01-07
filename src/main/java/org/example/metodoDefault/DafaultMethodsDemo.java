package org.example.metodoDefault;



import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DafaultMethodsDemo {

    public static void main(String ... args){

        List<Integer> nums = Stream.of(-3, 1,-5,2,-8,4,10).collect(Collectors.toList());
        //System.out.println(nums);

        //Remove recibe como parametro un lambda que implementa la condicion
        //Si elimina algo es true.
        boolean removed =  nums.removeIf(n-> n < 0);
        System.out.println("eliminados: "+removed);
        System.out.println("No eliminados: "+nums);
    }

}
