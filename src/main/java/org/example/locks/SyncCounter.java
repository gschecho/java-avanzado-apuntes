package org.example.locks;

public class SyncCounter {
    private int count;

    //Con synchronized Ningun otro thread puede utilizar el  metodo  del objeto hasta que el anterior  finalice.
    //Esto es un lock implicito del propio objeto.
    public synchronized void increment(){

        count++;
    }
    public int getCount() {
        return count;
    }
}
