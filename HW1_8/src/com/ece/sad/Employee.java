package com.ece.sad;

public class Employee {
    private String name;
    private String gender;
    private String retireStatus;

    public Employee(String name, String gender, String retireStatus) {
        this.name = name;
        this.gender = gender;
        this.retireStatus = retireStatus;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getRetireStatus() {
        return retireStatus;
    }
}
