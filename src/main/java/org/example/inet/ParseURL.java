package org.example.inet;

import java.net.URL;

public class ParseURL {
    public static void main(String ... args) throws Exception{

        // Googlegeocoding API
        URL aURL = new URL("http://www.google.es");

        System.out.println("Protocolo = "+ aURL.getProtocol());
        System.out.println("authority = "+ aURL.getAuthority());
        System.out.println("host = "+ aURL.getHost());
        System.out.println("puerto = "+ aURL.getPort());
        System.out.println("path = "+ aURL.getPath());
        System.out.println("query = "+ aURL.getQuery());
        System.out.println("Filename = "+ aURL.getFile());
        System.out.println("Ref = "+ aURL.getRef());


    }
}
