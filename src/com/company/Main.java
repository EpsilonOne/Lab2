package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>() {
        };
        Owner o1 = new Owner("Craig ", 8589006141L);
        Company company = new Company("ABCCO", o1, employeeList);

	    Employee e1 = new Employee("John", 3234567892L);
        Employee e2 = new Employee("Mary", 2343234563L);
        Employee e3 = new Employee("Jack", 2323232323L);
        Employee e4 = new Employee("Katie", 2325465432L);
        Employee e5 = new Employee("Amy", 9375635273L);
        Employee e6 = new Employee("Jim", 2343234323L);
        Employee e7 = new Employee("Greg", 9365483746L);

        company.hireNewEmployee(e1);
        company.hireNewEmployee(e2);
        company.hireNewEmployee(e3);
        company.hireNewEmployee(e4);
        company.hireNewEmployee(e5);
        company.hireNewEmployee(e6);
        company.hireNewEmployee(e7);



        System.out.println("name: " + o1.getName() + "pNum:" + o1.getPhone());

    }
}
