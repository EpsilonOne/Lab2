package com.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String address;
    private Owner owner;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name, String address, Owner owner, ArrayList<Employee> employees) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.employees = employees;
    }

    public void hireNewEmployee(Employee e){
        employees.add(e);

    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println("Employee: " +employee.getName());
        }
    }

    public void sendAnnouncement(String news){
        for (Employee employee : employees){
            employee.receiveNews(news);
        }
    }

}
