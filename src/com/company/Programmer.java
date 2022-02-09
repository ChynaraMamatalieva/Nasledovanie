package com.company;

public class Programmer extends Person {
    String companyName;

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;


    }


    void coding() {
        System.out.println(name + " is coding");
    }
}


