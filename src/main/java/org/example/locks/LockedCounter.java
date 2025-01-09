package org.example.locks;

import java.util.concurrent.locks.ReentrantLock;

public class LockedCounter {
    private int count;

    //Clase reentranlock sirve para bloquear y debloquear zonas del codigo
    private ReentrantLock lock = new ReentrantLock();

    // lock.tryLock();
    //tryLock() del reentrantLock sirve para evitar los deadthreads... que no obtienen recursos para hacer la tarea que necesitan
    public void increment(){


        lock.lock();
        try{
            count++;
        }finally {
            lock.unlock();
        }

    }
    public int getCount() {
        lock.lock();
        try{
            return count;
        }finally {
            lock.unlock();
        }

    }
}
