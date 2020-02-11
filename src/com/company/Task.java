package com.company;

public class Task {
    //Attributes
    private String taskID;
    private String description;
    private boolean complete;
    private Worker worker;

    public Task(String taskID, String description) {
        this.taskID = taskID;
        this.description = description;
        this.complete = false;
    }
}
