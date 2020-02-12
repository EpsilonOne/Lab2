package com.company;

public class Main {

    public static void main(String[] args) {

        //Create Owner and company, add company to owner
        Owner craig = new Owner("Craig ", 8589006141L);
        Company company = new Company("ABCCO", "123 Main St", craig);
        craig.addCompany(company);


        //Create and hire Employees
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

        //Print out company information
        System.out.println(company.toString());

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

        //Owner make an announcement
        String n = "Good Job!";
        System.out.println("Owner Announcement sent");
        craig.announceNews(n);

        //print out employees received news
        System.out.println("Employees received news: " + jim.getNews());

        //create and assign tasks
        Task t1 = new Task("t1", "Make Coffee");
        Task t2 = new Task("t2", "Bring Shane the coffee");
        System.out.println("Mary assigns task t1 to Greg, and task t2 to Amy");
        mary.assignTask(t1, greg);
        mary.assignTask(t2, amy);

        //print out greg and amy's tasks then greg's again after amy delegates
        System.out.println("Greg's Tasks: ");
        greg.printTasks();
        System.out.println("Amy's Tasks: ");
        amy.printTasks();
        amy.setDelegate(greg);
        System.out.println("Greg's Tasks after Amy delegates her task to Greg: ");
        greg.printTasks();

        //Greg performs tasks
        System.out.println("Greg performs tasks: ");
        greg.performTasks();
        greg.printTasksDone();

        //Print out workers for both Mary and John
        System.out.println("Mary's workers");
        mary.printWorkers();
        System.out.println("John's workers");
        john.printWorkers();

        //Delegate Mary's workers to John and print John's workers after
        mary.setDelegate(john);
        System.out.println("John's workers after Mary delegates to John");
        john.printWorkers();

        //print Greg's salary before and after John Updates it.
        System.out.println("Greg's current salary: " + greg.getSalary());
        john.updateSalary(greg, 1000);
        System.out.println("Greg's salary after John updates: " + greg.getSalary());
    }
}
