package com.company;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private ArrayList<Worker> workers = new ArrayList<Worker>();
    private List<Project> projects = new ArrayList<Project>();
    private Manager myDelegate;
    private List<Manager> myColleagues = new ArrayList<Manager>();

    public Manager(String name, long pNum) {
        super(name, pNum);
        setSalary(75000);

    }
    //Attributes

    //Methods
    public void addWorkerToManage(Worker w){
        workers.add(w);
    }

    public ArrayList<Worker> getWorkers(){
        return workers;
    }

    public void assignTask(Task t, Worker w){
        w.addTaskToWork(t);

    }

    public List<Task> collectCompletedTasks(){

        return null;
    }

    public void evaluateEmployeesPerformance(){

    }

    protected void setDelegate(Manager m){
        myDelegate = m;


    }

    public void addColleague(Manager c){
        myColleagues.add(c);
    }

    public void updateSalary(Worker w, int r){
        w.setSalary(w.getSalary() + r);


    }
}
