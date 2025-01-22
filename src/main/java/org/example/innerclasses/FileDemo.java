package org.example.innerclasses;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo {


    public static void main(String[] args) {

        File dir = new File("src/main/java/org/example/innerclasses");
        for (String name : dir.list()){
            System.out.println(name);
        }

        // Con clase externa
        System.out.println("\n Solo imprime los archivos .java");
        for (String name:dir.list(new JavaFilter())){
            System.out.println(name);
        }

        // Inner class anonima
        System.out.println("\n Solo imprime .txt");
        for (String name:dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        })){
            System.out.println(name);
        }


    }
}
