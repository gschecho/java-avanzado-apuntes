package org.example.callable;


import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseMyCallable {
    public static void main (String ... args){
        List<Callable<String>> callables = Stream.iterate(0, n-> n + 1)
                .limit(10)
                .map(MyCallable::new)
                .collect(Collectors.toList());
        ExecutorService service = Executors.newFixedThreadPool(3);

        //Future no tiene autocloseable por lo que el bloque try catch ha de ser completo
        // no puede ser el try con recursos.
        try {
            List<Future<String>> futures = service.invokeAll(callables);
            for (Future<String> future : futures) {

                //Bloquea hasta que cada callable se haya completado
                System.out.println(future.get());
            }
        }catch(InterruptedException | ExecutionException ex){
                ex.printStackTrace();
            } finally{
                service.shutdown();
            }
        }}
