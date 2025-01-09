package org.example.latch;


import java.util.concurrent.CountDownLatch;

public class LatchDemo {
    public static void main(String ... args) throws InterruptedException{
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch endSignal = new CountDownLatch(5);

        for (int i = 0; i < 5; i++){
            new Thread(new Worker(i, startSignal, endSignal)).start();
        }
        System.out.println("Algo hecho antes de empezar el Worker");
        startSignal.countDown(); // hace que todos empiecen a trabajar
        System.out.println("Haciendo algo mientras Worker trabaja");
        endSignal.await(); // El metodo esperara a que todos los Worker finalicen
        System.out.println("Los Workers han finalizado");
//        Worker worker = new Worker();
    }
}
