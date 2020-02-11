package com.company;

import java.util.List;

public class Project {
    //Attributes
    private String projectName;
    private int status;
    private Manager manager;
    private List<Task> tasks;

    //Methods
    public void addTask(Task t){
        tasks.add(t);
    }

    public List<Task> getTasks(){

        return tasks;
    }

}
