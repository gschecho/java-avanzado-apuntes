package org.example.producerConsumer;

import java.util.concurrent.BlockingQueue;

// Implement Runnable hace que esta se ejecute en   su propio thread
public class Producer implements Runnable {

    private int id;
    private BlockingQueue<Message> queue;

    public Producer(int id, BlockingQueue<Message> queue){
        this.id= id;
        this.queue= queue;
    }


    // El metodo run ejecuta el codigo en un nuevo thread
    @Override
    public void run(){
        for (int i = 0; i < 100; i++){
            Message msg = new Message(i);
            try {
                System.out.printf("Producer %d produce %d%n", id, msg.getId());
                // Añade el mensaje a la cola
                queue.put(msg);

                // Hace que el thread se duerma durante un tiempo random dentro 100
                Thread.sleep((long)(Math.random()*100));
            }catch( InterruptedException ex){
                ex.printStackTrace();
            }

        } try {
            // envia el valor de -1 a la cola asi se interrumpe el bloqueo
            queue.put(new Message(-1));
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

    }
}
