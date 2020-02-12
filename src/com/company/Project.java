package com.company;

import java.util.List;

public class Project {

    /*****Attributes*****/
    private String projectName; //name of project
    private int status; //project status
    private Manager manager; //manager project assigned to
    private List<Task> tasks; //list of tasks for project

    /*****Constructor*****/
    public Project(String projectName, int status, Manager manager, List<Task> tasks) {
        this.projectName = projectName;
        this.status = status;
        this.manager = manager;
        this.tasks = tasks;
    }

    /*****Methods*****/
    //Accepts task type and adds to task list
    public void addTask(Task t){
        tasks.add(t);
    }

    //getter for task list
    public List<Task> getTasks(){

        return tasks;
    }

}
