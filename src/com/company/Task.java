package com.company;

public class Task {

    /*****Attributes*****/
    private String taskID; //task id
    private String description; //Task description
    private boolean complete; //Task complete status
    private Worker worker;

    /*****Constructor*****/
    public Task(String taskID, String description) {
        this.taskID = taskID;
        this.description = description;
        this.complete = false;
    }

    /*****Methods*****/
    //getter for id
    public String getTaskID() {
        return taskID;
    }

    //setter for id
    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    //getter for description
    public String getDescription() {
        return description;
    }

    //setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    //Accepts task type and sets complete to true
    public void taskCompleted(Task t){
        t.complete = true;
    }
}
