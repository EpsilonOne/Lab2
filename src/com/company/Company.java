package com.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String address;
    private Owner owner;
    private ArrayList<Employee> employees;

    public Company(String name, Owner owner, ArrayList<Employee> employees) {
        this.name = name;
        this.owner = owner;
        this.employees = employees;
    }

    public void hireNewEmployee(Employee e){
        employees.add(e);

    }
}
