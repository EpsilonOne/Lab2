package com.company;

//SubClass of People & SuperClass of Manager and Worker
public class Employee extends People{

    /*****Attributes*****/
    private Employee myDelegate; //employee to delegate to
    private boolean isOnVacation; //for vacation status
    private int performanceScale; //performance scale 1 to 5
    private int salary; //employee salary
    private String news; //news from Owner

    /*****Constructor*****/
    public Employee(String name, long phone) {
        super(name, phone);
        this.isOnVacation = false;
        this.performanceScale = 0;
    }

    /*****Methods*****/
    //accepts a string and assigns to news
    public void receiveNews(String n){
        news = n;

    }

    public int getPerformanceScale() {
        return performanceScale;
    }

    public void setPerformanceScale(int performanceScale) {
        this.performanceScale = performanceScale;
    }

    //getter for news
    public String getNews() {
        return news;
    }

    //setter for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    //getter for salary
    public int getSalary() {
        return salary;
    }

    //accepts an employee type to assign as delegate
    protected void setDelegate(Employee e){
        myDelegate = e;

    }

    //change isOnVacation to true
    public void isOnVacation(){
        isOnVacation = true;
    }
}
