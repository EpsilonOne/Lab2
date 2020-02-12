package com.company;

import java.util.ArrayList;
import java.util.List;

public class Worker extends Employee {
    private Worker myDelegate;
    private List<Worker> myColleagues = new ArrayList<>();
    private List<Task> tasks = new ArrayList<>();
    private Manager manager;
    public Worker(String name, long pNum) {
        super(name, pNum);
        setSalary(50000);
    }

    //Methods
    public void addTaskToWork(Task t){
        tasks.add(t);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void printTasks(){
        for(Task task : tasks) {
            System.out.println(task.getTaskID());
        }

    }
    public void performTasks(){

    }

    public void getTasksDone(){

    }


    protected void setDelegate(Worker w) {
        myDelegate = w;
        this.isOnVacation();
        for (Task task : tasks){
            w.addTaskToWork(task);
        }
    }

    public void addColleague(Worker c){
        myColleagues.add(c);
    }
}
