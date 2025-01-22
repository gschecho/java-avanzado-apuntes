package org.example.innerclasses;

public class Outer {

    private int anInt;
    private String string;







    // Una clase dentro de otra clase
   public class Inner{
        public void method(){
            System.out.println("Podemos acceder a los datos de la clase exterior:" +"\nanInt= "+anInt+"\nstring= "+string);
        }
    }


    public static class StaticInner{
        public void method(){
            System.out.println("No Podemos acceder a los datos de la clase exterior, son estáticos:" +"\nanInt= "+"\nstring= ");
        }
    }
}
