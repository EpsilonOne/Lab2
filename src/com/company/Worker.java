package com.company;

import java.util.ArrayList;
import java.util.List;

//Subclass of Employee
public class Worker extends Employee {

    /*****Attributes*****/
    private Worker myDelegate; //Worker to delegate tasks to
    private List<Worker> myColleagues = new ArrayList<>(); //list of other workers
    private List<Task> tasks = new ArrayList<>(); //list of tasks assigned
    private List<Task> tasksDone = new ArrayList<>(); //list of tasks completed
    private Manager manager;

    /*****Constructor*****/
    public Worker(String name, long pNum) {
        super(name, pNum);
        setSalary(50000);
    }

    /*****Methods*****/
    //Accepts task type and adds to list of tasks
    public void addTaskToWork(Task t){
        tasks.add(t);
    }

    //getter for tasks
    public List<Task> getTasks() {
        return tasks;
    }

    //print method to print list of tasks
    public void printTasks(){
        for(Task task : tasks) {
            System.out.println(task.getTaskID());
        }
    }

    //Method to complete tacks by setting each task in list to complete(true)
    public void performTasks() {
        for (Task task : tasks) {
            tasksDone.add(task);
        }
    }

    //getter for tasksDone list
    public List<Task> getTasksDone(){
        return tasksDone;
    }

    public void printTasksDone(){
        for(Task taskDone : tasksDone) {
            System.out.println(taskDone.getTaskID() +": "+ taskDone.getDescription());
        }
    }
    /*Accepts a worker type to delegate worker by sending this workers tasks
     to the delegates tasks allowing the delegate to perform those tasks*/
    protected void setDelegate(Worker w) {
        myDelegate = w;
        this.isOnVacation();
        for (Task task : tasks){
            w.addTaskToWork(task);
        }
    }

    //Accepts worker type and adds to list of colleagues
    public void addColleague(Worker c){
        myColleagues.add(c);
    }
}
