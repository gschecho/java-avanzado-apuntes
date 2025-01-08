package org.example.runnable;

public class MyRunnable implements Runnable {
    private int id;
    private Thread hilo = new Thread(this);

    public MyRunnable(int id){
        this.id = id;
    }

    @Override
    public void run(){
        System.out.println("Hola desde: " +  this);
    }

    public void start(){
        hilo.start();
    }

    @Override
    public String toString(){
        return String.format("My runnable{id= %d}", id);
    }
}
