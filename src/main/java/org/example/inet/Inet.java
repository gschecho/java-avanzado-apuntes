package org.example.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet {
    public static void  main(String ... args){
        try{
        System.out.println(InetAddress.getLocalHost());
        }catch(UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
