package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        Owner craig = new Owner("Craig ", 8589006141L);
        Company company = new Company("ABCCO", "123 Main St", craig, employeeList);
        craig.addCompany(company);

        //add and hire Employees
        Manager john = new Manager("John", 2345678901L);
        company.hireNewEmployee(john);
        Manager mary = new Manager("Mary", 2345678903L);
        company.hireNewEmployee(mary);
        Worker jack = new Worker("Jack", 2345678902L);
        company.hireNewEmployee(jack);
        Worker katie = new Worker("Katie", 2345678909L);
        company.hireNewEmployee(katie);
        Worker amy = new Worker("Amy", 2456789021L);
        company.hireNewEmployee(amy);
        Worker jim = new Worker("Jim", 2345678907L);
        company.hireNewEmployee(jim);
        Worker greg = new Worker("Greg", 2345678906L);
        company.hireNewEmployee(greg);

        //add johns workers and colleague
        john.addWorkerToManage(jack);
        john.addWorkerToManage(jim);
        john.addColleague(mary);

        //add marys workers and colleagues
        mary.addWorkerToManage(katie);
        mary.addWorkerToManage(amy);
        mary.addWorkerToManage(greg);
        mary.addColleague(john);

        //add Jack's colleagues
        jack.addColleague(katie);
        jack.addColleague(amy);
        jack.addColleague(jim);
        jack.addColleague(greg);

        //add Katie's colleagues
        katie.addColleague(jack);
        katie.addColleague(amy);
        katie.addColleague(jim);
        katie.addColleague(greg);

        //add Amy's colleagues
        amy.addColleague(jack);
        amy.addColleague(katie);
        amy.addColleague(jim);
        amy.addColleague(greg);

        //add Jim's colleagues
        jim.addColleague(jack);
        jim.addColleague(katie);
        jim.addColleague(amy);
        jim.addColleague(greg);

        //add Greg's colleagues
        greg.addColleague(jack);
        greg.addColleague(katie);
        greg.addColleague(amy);
        greg.addColleague(jim);

        craig.announceNews("Good Job!");
        System.out.println(jim.getNews());

        Task t1 = new Task("t1", "wipe my butt");
        Task t2 = new Task("t2", "Wsh your hands");
        mary.assignTask(t1, greg);
        mary.assignTask(t2, amy);

        System.out.println(jim.getSalary());
        john.updateSalary(jim, 1000);
        System.out.println(jim.getSalary());

        //company.printEmployees();

    }
}
