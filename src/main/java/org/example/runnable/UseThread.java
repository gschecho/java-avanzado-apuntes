package org.example.runnable;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// JAVA 8

public class UseThread {
    public static void main(String ... args){
        List<MyThread> hilos = Stream.iterate(1 , n-> n+1).map(MyThread::new).limit(10).collect(Collectors.toList());
        hilos.forEach(MyThread::start);
    }
}
