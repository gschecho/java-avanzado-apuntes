package org.example.producerConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerDemo {
    public static void main(String ... args){
        BlockingQueue<Message> queue = new LinkedBlockingQueue<>();
        Producer p1 = new Producer(1, queue);
        Consumer c1 = new Consumer(1, queue);
        Producer p2 = new Producer(2, queue);
        Consumer c2 = new Consumer(2, queue);

        // Fix Thread pull coje un int para saber cuantos procesos hay
        // Runtime.getRuntime() nos dice cuantos procesos hay abiertos
        ExecutorService service = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors());
        service.execute(p1);
        service.execute(c1);
        service.execute(p2);
        service.execute(c2);
        service.shutdown();
    }
}
