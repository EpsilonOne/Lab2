package com.company;

//SubClass of People
public class Employee extends People{


    //Attributes
    private Employee myDelegate;
    private boolean isOnVacation;
    private int performanceScale;
    private int salary;
    private String news;

    public Employee(String name, long phone) {
        super(name, phone);
        this.isOnVacation = false;
        this.performanceScale = 0;
    }

    //Methods
    public void receiveNews(String n){
        news = n;

    }

    public String getNews() {
        return news;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    protected void setDelegate(Employee e){
        myDelegate = e;

    }

    public void isOnVacation(){

    }


    public void setOnVacation() {
        isOnVacation = true;
    }


}
