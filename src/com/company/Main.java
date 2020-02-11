package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>() {
        };
	    Owner o1 = new Owner("Craig ", 8589006141L);
	    Company company = new Company("ABCCO", o1, employeeList);
	    System.out.println("name: " + o1.getName() + "pNum:" + o1.getPhone());

    }
}
