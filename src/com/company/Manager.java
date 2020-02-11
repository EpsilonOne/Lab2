package com.company;

import java.util.List;

public class Manager extends Employee {
    private List<Worker> workers;
    private List<Project> projects;
    private Manager myDelegate;
    private List<Manager> myColleagues;

    public Manager(String name, int phone) {
        super(name, phone);
    }
    //Attributes

    //Methods
    public void addWorkerToManage(){

    }

    public List<Worker> getWorkers(){
        return workers;
    }

    public void assignTask(Task t, Worker w){

    }

    public List<Task> collectCompletedTasks(){

        return null;
    }

    public void evaluateEmployeesPerformance(){

    }

    protected void setDelegate(){

    }

    public void addColleague(Manager c){
        myColleagues.add(c);
    }

    public void updateSalary(Employee e){

    }
}
