package org.example.exception;

public class MyException extends Exception{

    public MyException(String message){
        super(message);
    }

    public MyException(){
        this("Mensaje Default");
    }
}
