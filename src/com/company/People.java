package com.company;

/*SuperClass of Owner and Employee*/
public class People {

    /*****Attributes*****/
    private String name; //name of employee
    private long phone; //phone number of employee

    /*****Constructor*****/
    public People(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }

    /*****Methods*****/
    //getter for name
    public String getName() {
        return name;
    }

    //setter for name
    public void setName(String name) {
        this.name = name;
    }

    //getter for phone number
    public long getPhone() {
        return phone;
    }

    //setter for phone number
    public void setPhone(long phone) {
        this.phone = phone;
    }
}
