package org.example.runnable;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseRunnable {
    public static void main(String ... args){
        List<MyRunnable> hilos = Stream.iterate(0 , n-> n+1)
                .map(MyRunnable::new)
                .limit(10)
                .collect(Collectors.toList());
        hilos.forEach(MyRunnable::start);
    }
}
