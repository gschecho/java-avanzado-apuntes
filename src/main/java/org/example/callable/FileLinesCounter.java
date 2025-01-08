package org.example.callable;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;


//Los callables se diferencian de los runnables en que nos devuelven un future mientras los runnables son voids.
public class FileLinesCounter {
    private Path dir = Paths.get("src","main", "java", "org","example");

    public long computeTotalNumberOfLines(){
        long total=0;
        try{
            total = executeCounters().stream()
                    .mapToLong(this::extractValueFromFuture)
                    .sum();
        }catch(InterruptedException | IOException ex){
            ex.printStackTrace();
        }
        return total;
    }
    private List<Future<Long>> executeCounters() throws InterruptedException, IOException {
        ExecutorService service = Executors.newCachedThreadPool();
        List<Future<Long>> futures = service.invokeAll(getFileLineCounters());
        service.shutdown();
        return  futures;
    }

    private List<Callable<Long>> getFileLineCounters() throws IOException{
        // Nos da la lista de directorios
        // Filtra los archivos
        return Files.list(dir)
                .filter(Files::isRegularFile)
                //.map(this::callableCounter)
                .map(this::callablePrintingCounter)
                .collect(Collectors.toList());
    }

    private Callable<Long> callableCounter(Path p){
        //count devuelve long por eso le ponemos long al callable
        return ()-> Files.lines(p).count();
    }


    private Callable<Long> callablePrintingCounter(Path p){
        return ()->{
            long count = Files.lines(p).count();
            System.out.printf("%s tine %d lineas \r", p, count);
            return count;
        };
    }

        //Future get() lanza exepciones hay que capturarlas aqui
        //al decir que el metodo devuelve un generico T podemos conseguir cualquier tipo de future
        private<T> T extractValueFromFuture(Future<T> future){
            T val = null;
            try{
                val= future.get();
            }catch(InterruptedException | ExecutionException ex){
                ex.printStackTrace();
            }
            return val;
        }

        public static void main(String ... args){
        FileLinesCounter demo = new FileLinesCounter();
            System.out.printf("Numero de lineas %d%n", demo.computeTotalNumberOfLines());
    }

}
