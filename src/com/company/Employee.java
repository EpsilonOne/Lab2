package com.company;

//SubClass of People
public class Employee extends People{
    //Attributes
    private boolean isOnVacation;
    private int performanceScale;
    private int salary;

    public Employee(String name, long phone) {
        super(name, phone);
    }

    //Methods
    public void receiveNews(String n){

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    protected void setDelegate(){

    }

    public void isOnVacation(){

    }


    public void setOnVacation() {

    }


}
