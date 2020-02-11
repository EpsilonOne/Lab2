package com.company;

import java.util.ArrayList;
import java.util.List;

public class Owner extends People {
    private List<Manager> managers;
    private Company company;
    public Owner(String name, long pNum) {
        super(name, pNum);
    }

    //Methods
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

    public void announceNews(String news){
        company.sendAnnouncement(news);
    }
}
