package org.example.lambdasystreams;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaDemo {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5)
                .forEach(n-> System.out.println(n));
                //.forEach( System.out::println);


        Consumer<Integer> impresora = n -> System.out.println(n);
        Stream.of(1,2,3,4,5).forEach(impresora);

        Predicate<Integer> mod3 = n -> n % 3 == 0;
        Stream.of(1,2,3,4,5).filter(mod3).forEach(impresora);

        Function<Integer, Integer> doblador = n->n*2;
        Stream.of(1,2,3,4,5).map(doblador).filter(mod3).forEach(impresora);



    }}
