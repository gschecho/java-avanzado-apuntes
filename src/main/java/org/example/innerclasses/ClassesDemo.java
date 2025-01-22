package org.example.innerclasses;

import org.hibernate.dialect.InnoDBStorageEngine;

public class ClassesDemo {
    public static void main(String[] args) {

        // Inner es una instancia de Outer
        //Inner class puede acceder a todos los elementos privados de outer
        new Outer().new Inner().method();

        // Instanciamos staticInner
        new Outer.StaticInner().method();

    }
}
