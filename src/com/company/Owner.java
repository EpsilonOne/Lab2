package com.company;

import java.util.List;

public class Owner extends People {

    /*****Attributes*****/
    private List<Manager> managers; //list of managers
    private Company company; //Company of Owner

    /*****Constructor*****/
    public Owner(String name, long pNum) {
        super(name, pNum);
    }

    /*****Methods*****/
    //sets company
    public void addCompany(Company c){
        this.company = c;
    }

    public void startProject(){

    }

    private void createProject(){

    }

    public void assignProjects(){

    }

    public void updateSalary(Manager m){

    }

    //sends news message to company class method
    public void announceNews(String news){
        company.sendAnnouncement(news);
    }
}
