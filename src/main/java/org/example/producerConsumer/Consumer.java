package org.example.producerConsumer;


import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private int id;
    private BlockingQueue<Message> queue;

    public Consumer(int id, BlockingQueue<Message> queue){
        this.id = id;
        this.queue = queue;
    }

    @Override
    public void run(){
        Message msg;
        try {
            // take() bloquea el thread hasta que halla algo que consumir
            while ((msg = queue.take()).getId() != -1){
                System.out.printf("Consumer %d consume %d%n", id, msg.getId());
                Thread.sleep((int)(Math.random() * 100));
            }
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
