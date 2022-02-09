package com.company;

public class Dancer extends Person {
    String groupName;

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    void dancing() {
        System.out.println(name + " is dancing");
    }
}
