package org.example.latch;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable{
    private int id;
    private CountDownLatch startSignal;
    private CountDownLatch endSignal;

    public Worker(int id, CountDownLatch startSignal, CountDownLatch endSignal){
        this.id = id;
        this.endSignal = endSignal;
        this.startSignal = startSignal;


    }

    @Override
    public void run(){
        try{
            System.out.printf("%d Esperando a que empieze clase worker ... %n", id);
            startSignal.await();
            System.out.printf("%d Funcionando para completarse clase worker %n", id);
            endSignal.countDown();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
