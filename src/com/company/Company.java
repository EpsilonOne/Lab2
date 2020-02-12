package com.company;

import java.util.ArrayList;

public class Company {

    /*****Attributes*****/
    private String name; //company name
    private String address; //company address
    private Owner owner; //owner of company
    private ArrayList<Employee> employees = new ArrayList<>(); //list of employees

    /*****Constructor*****/
    public Company(String name, String address, Owner owner) {
        this.name = name;
        this.address = address;
        this.owner = owner;
    }

    /*****Methods*****/
    //Accepts employee type to add to list of employees
    public void hireNewEmployee(Employee e){
        employees.add(e);

    }

    //Prints out employees list
    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println("Employee: " +employee.getName());
        }
    }

    //Accepts String and sets each employee news to String
    public void sendAnnouncement(String news){
        for (Employee employee : employees){
            employee.receiveNews(news);
        }
    }

    //Override to string to print company info
    @Override
    public String toString() {
        return "Company [Name = " + name + ", Owner: " + owner.getName() + ", # of Employees: " + employees.size()+ "]";
    }
}
