package org.example.locks;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    private AtomicInteger count = new AtomicInteger();

    // Atomic calcula y devuelve antes de que otro thread pida algo. No hace falta que utilizemos synconyzed manualmente para incrementar y actualizar algunas cosas.


    public void increment(){
        count.incrementAndGet();
    }
    public int getCount() {
        return count.get();
    }
}
