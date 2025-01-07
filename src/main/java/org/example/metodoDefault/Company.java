package org.example.metodoDefault;

public interface Company {

    default String getName(){
        return "default.Company";
    }
}
