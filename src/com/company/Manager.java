package com.company;

import java.util.ArrayList;
import java.util.List;

//SubClass of Employee
public class Manager extends Employee {

    /*****Attributes*****/
    private ArrayList<Worker> workers = new ArrayList<>(); //list of workers that report to manager
    private List<Project> projects = new ArrayList<>(); //list of projects assigned to manager
    private Manager myDelegate; //Manager to delegate to
    private List<Manager> myColleagues = new ArrayList<>(); //List of colleagues

    /*****Constructor*****/
    public Manager(String name, long pNum) {
        super(name, pNum);
        setSalary(75000);
    }

    /*****Methods*****/
    //Accepts worker type and adds to workers list
    public void addWorkerToManage(Worker w) {
        workers.add(w);
    }

    //getter for workers list
    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    //Accepts Task and Worker types and adds task to workers list of tasks
    public void assignTask(Task t, Worker w) {
        w.addTaskToWork(t);
    }

    //accepts worker type and returns that workers completed tasks list
    public List<Task> collectCompletedTasks(Worker w) {
        return w.getTasksDone();
    }

    //accepts Worker and int type and sets w's performance number to s
    public void evaluateEmployeesPerformance(Worker w, int s) {
        w.setPerformanceScale(s);
    }

    /*Accepts a manager type to delegate workers by sending this managers workers
    to the delegates workers allowing the delegate to perform actions on those workers*/
    protected void setDelegate(Manager m) {
        myDelegate = m;
        for (Worker worker : workers) {
            m.addWorkerToManage(worker);
        }
    }

    //prints list of workers managed by this manager
    public void printWorkers() {
        for (Worker worker : workers) {
            System.out.println(worker.getName());
        }
    }


    public void addColleague(Manager c) {
        myColleagues.add(c);
    }

    public void updateSalary(Worker w, int r) {
        w.setSalary(w.getSalary() + r);


    }
}

