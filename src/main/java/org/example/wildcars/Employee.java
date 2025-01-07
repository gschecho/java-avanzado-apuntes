package org.example.wildcars;

import com.sun.source.tree.EmptyStatementTree;

public class Employee  {
    private String name;
    public Employee(String name){
        this.name= name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return String.format("Employee{name= '%s'}", name);
    }
}
