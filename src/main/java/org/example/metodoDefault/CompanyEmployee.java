package org.example.metodoDefault;

public class CompanyEmployee implements Company, Employee{
    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public void doWork() {

    }

    @Override
    public String getName() {
        return String.format("%s working for %s", Employee.super.getName(), Company.super.getName());
    }
}
